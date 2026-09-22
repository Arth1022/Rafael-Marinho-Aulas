package listadupla;

public class Principal{
    public static void main(String[] args) {

        ListaDupla<Produto> lista = new ListaDupla<Produto>("Produtos");
        
        lista.addInicio(new Produto("Celular", 2100.0));
        lista.addFinal(new Produto("Tablet", 1100.0));
        lista.addMeio(new Produto("PC", 2300.0), 1);
        lista.imprimeLista();
        
        System.out.println("Dado: " + lista.removeMeio(1) + " removido!");
        System.out.println("Adicionado no inicio e final da lista");

        lista.addInicio(new Produto("Roteador", 100.0));
        lista.addFinal(new Produto("TV", 1500.0));

        lista.imprimeLista();
    }
}