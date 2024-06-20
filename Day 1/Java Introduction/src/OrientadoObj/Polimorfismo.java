package OrientadoObj;

public class Polimorfismo {
    public static void main(String[] args) {
        // Criando objetos das classes derivadas
        Animal meuAnimal = new Animal();
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        // Chamando o método fazerSom() em diferentes objetos
        meuAnimal.fazerSom();    // Output: O animal faz um som.
        meuCachorro.fazerSom();  // Output: O cachorro late.
        meuGato.fazerSom();      // Output: O gato mia.

        // Demonstrando polimorfismo com um array de animais
        Animal[] animais = {meuAnimal, meuCachorro, meuGato};
        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}
