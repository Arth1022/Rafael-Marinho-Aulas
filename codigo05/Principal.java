public class Principal{
    public static void main(String[] args) {
/*
        NoDuplo<String> no1 = new NoDuplo<String>("Rafael");
        NoDuplo<String> no2 = new NoDuplo<String>("Cecília");
        NoDuplo<String> no3 = new NoDuplo<String>("Joaquim");
        NoDuplo<String> no4 = new NoDuplo<String>("Lara");

        no1.setProximoNo(no2);
        no2.setAnteriorNo(no1);
        no2.setProximoNo(no3);
        no3.setAnteriorNo(no2);
        no3.setProximoNo(no4);
        no4.setAnteriorNo(no3);

        System.out.println(no1.toString());
        System.out.println(no1.getProximoNo().toString());
        System.out.println(no1.getProximoNo().getProximoNo().toString());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().toString());
*/        

        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.addInicio("Rafael");
        lista.addInicio("Cecília");
        lista.addFinal("Teste");
        lista.imprimeLista();

        lista.removeMeio(3);
        lista.imprimeLista();

        /*
        System.out.println("Dado: " + lista.removeInicio() + " removido!");
        lista.imprimeLista();
        System.out.println("Dado: " + lista.removeFinal() + " removido!");
        lista.imprimeLista();
        */
    }
}