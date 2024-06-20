package OrientadoObj;

import com.sun.tools.javac.Main;

public class Classe {

    String nome;

    static String nome2;

    public static void main(String[] args) {
        System.out.println(new Classe().nome);
    }

    static void teste(){

    }

    void declaraNome(){
        System.out.println("Nome: " + nome2);
        Classe.teste();
        nome = "juan";

        Classe meuMain = new Classe();
        System.out.println(meuMain.nome);
    }

    String getNome(){
        return nome;
    }
}
