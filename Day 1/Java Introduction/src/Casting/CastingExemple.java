package Casting;

public class CastingExemple {
    public static void main(String[] args) {
        int idade1 = 22;
        double idade2 = idade1;

        idade1 = (int) idade2;

        char letra = 'a';
        String nome = String.valueOf(letra);
        letra = nome.charAt(0);
        String nome2 = String.valueOf(letra);
        idade1 = Integer.parseInt(nome2);
    }
}
