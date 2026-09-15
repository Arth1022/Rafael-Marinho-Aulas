public class Pilha<T>{
    private String nomePilha;
    private No<T> topo;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    public void setNomePilha(String nomePilha){
        this.nomePilha = nomePilha;
    }

    public String getNomePilha(){
        return this.nomePilha;
    }

    public void setTopo(No<T> topo){
        this.topo = topo;
    }

    public No<T> getTopo(){
        return this.topo;
    }

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);
        novoNo.setNextNo(topo);
        topo = novoNo;
        System.out.println(topo);
    }

    public T pop(){
        if(topo == null){
            System.out.println("Pilha esta vazia");
            return null;
        }
        T dado = topo.getDado();
        topo = topo.getNextNo();
        return dado;
    }

    public void imprimir(){
        if(topo == null){
            System.out.println("pilha esta vazia");
        }else{
            No<T> helper = topo;
            while (helper != null){
                helper.toString();
                System.out.println(helper);
                helper = helper.getNextNo();
            }
        }
    }

    public T pick(){
        if(topo == null){
            System.out.println("Pilha esta vazia");
            return null;
        }else{
            return topo.getDado();
        }
    }
}