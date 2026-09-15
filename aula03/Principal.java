public class Principal{
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>("Letras");

        pilha.push("A");
        pilha.push("D");
        pilha.push("C");

        pilha.imprimir();

        System.out.println(pilha.pop());

        pilha.imprimir();

        System.out.println(pilha.pick());

    }
}