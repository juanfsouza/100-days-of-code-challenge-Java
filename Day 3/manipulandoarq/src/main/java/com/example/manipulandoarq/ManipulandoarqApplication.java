package com.example.manipulandoarq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ManipulandoarqApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ManipulandoarqApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter file path: ");
			String sourceFileStr = sc.nextLine();
			File sourceFile = new File(sourceFileStr);

			String sourceFolderStr;
			if (sourceFile.isAbsolute() && sourceFile.getParentFile().exists()) {
				sourceFolderStr = sourceFile.getParent();
			} else {
				// Use user's home directory if the provided path is invalid
				sourceFolderStr = System.getProperty("user.home");
				System.out.println("Invalid path provided. Using default directory: " + sourceFolderStr);
			}

			// Create the 'out' directory inside the determined folder
			File outDir = new File(sourceFolderStr + File.separator + "out");
			boolean folderSuccess = outDir.exists() || outDir.mkdir();
			System.out.println("Folder created: " + folderSuccess);

			// Path for the 'out.csv' file inside the 'out' directory
			String outCsvFilePath = outDir.getPath() + File.separator + "out.csv";
			File outCsvFile = new File(outCsvFilePath);

			// Check if 'out.csv' exists, if not, create it with default content
			if (!outCsvFile.exists()) {
				System.out.println("'out.csv' does not exist. Creating with default content.");
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(outCsvFilePath))) {
					bw.write("TV LED,1290.99,1\n");
					bw.write("Video Game Chair,350.50,3\n");
					bw.write("Iphone X,900.00,2\n");
					bw.write("Sansung Galaxy,850.00,2\n");
				} catch (IOException e) {
					System.out.println("Error creating 'out.csv': " + e.getMessage());
				}
			}

			// Path for the new file inside the 'out' directory
			String summaryFilePath = outDir.getPath() + File.separator + "summary.csv";
			File summaryFile = new File(summaryFilePath);

			// Check if the file already exists, if not, create it
			if (summaryFile.createNewFile()) {
				System.out.println("File created: " + summaryFilePath);
			} else {
				System.out.println("File already exists: " + summaryFilePath);
			}

			// Read the CSV file and print its content
			List<String> summaryLines = new ArrayList<>();
			try (BufferedReader br = new BufferedReader(new FileReader(outCsvFilePath))) {
				String itemCsv = br.readLine();
				while (itemCsv != null) {
					System.out.println(itemCsv);

					// Process the CSV line
					String[] fields = itemCsv.split(",");
					String name = fields[0];
					double price = Double.parseDouble(fields[1]);
					int quantity = Integer.parseInt(fields[2]);

					// Calculate total value and format it
					double totalValue = price * quantity;
					String totalValueStr = String.format("%.2f", totalValue);
					if (totalValueStr.length() > 2) {
						totalValueStr = totalValueStr.substring(0, totalValueStr.length() - 2);
					}

					// Remove trailing comma if exists
					if (totalValueStr.endsWith(",")) {
						totalValueStr = totalValueStr.substring(0, totalValueStr.length() - 1);
					}

					// Add the processed line to the summary
					summaryLines.add(name + ", " + totalValueStr);

					itemCsv = br.readLine();
				}
			} catch (IOException e) {
				System.out.println("Error reading file: " + e.getMessage());
			}

			// Write the summary to the new file
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(summaryFilePath))) {
				for (String line : summaryLines) {
					bw.write(line);
					bw.newLine();    // move to the next line
				}
				System.out.println("Summary file created: " + summaryFilePath);
			} catch (IOException e) {
				System.out.println("Error writing summary file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
