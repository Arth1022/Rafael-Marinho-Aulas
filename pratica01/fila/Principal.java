package fila;

public class Principal{
    public static void main(String[] args) {
        Fila<String> fila = new Fila<String>("Nomes alunos");
        fila.enfileirar("Arthur");
        fila.enfileirar("Joao");
        fila.enfileirar("Rafael");

        fila.imprimeFila();

        System.out.println("Aluno removido: " + fila.desenfileirar());

        System.out.println(fila.getPrimeiroNo().getDado());
        System.out.println("Adicionado dois alunos a fila");
        fila.enfileirar("Pedro");
        fila.enfileirar("Cleiton");
        fila.imprimeFila();
    }   
}