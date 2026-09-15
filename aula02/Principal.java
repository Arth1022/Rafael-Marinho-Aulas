
public class Principal{
    public static void main(String[] args){
         Lista<String> lista = new Lista<String>("Alunos");  
         lista.addInicio("Rafael");
         lista.imprimeLista();

         lista.addInicio("Arthur");
         lista.imprimeLista();

         lista.addInicio("Daniel");
         lista.imprimeLista();

         lista.removerNo();
         lista.imprimeLista();
        
    }
}