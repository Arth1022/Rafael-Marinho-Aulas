package pilha;
public class Principal{
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>("Linguagens");
        pilha.push("JAVA");
        pilha.push("C#");
        pilha.push("RUST");
        pilha.imprimePilha();
        

        System.out.println("Dado removido " + pilha.pop());
        System.out.println(pilha.peek());

        pilha.push("Python");
        pilha.push("Lua");
        System.out.println("Duas linguagens adicionadas");
        pilha.imprimePilha();
    }
}