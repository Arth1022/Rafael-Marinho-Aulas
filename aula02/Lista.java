import pilha.No;

public class Lista<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista(){
        this("Lista");
    }

    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void setNomeLista(String nomeLista){
        this.nomeLista = nomeLista;
    }

    public String getNomeLista(){
        return this.nomeLista;
    }

    public void setPrimeiroNo(No<T> primeiroNo){
        this.primeiroNo = primeiroNo;
    }

    public No<T> getPrimeiroNo(){
        return this.primeiroNo;
    }

    public void setUltimoNo(No<T> ultimoNo){
        this.ultimoNo = ultimoNo;
    }

    public No<T> getUltimoNo(){
        return this.ultimoNo;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            
        } else{
            novoNo.setNextNo(primeiroNo);
            ultimoNo = novoNo;
        }
    }

    public void removerNo(){
        if(primeiroNo == null){
            System.out.println("A lista esta vazia");
        }else{
            System.out.println("Ultimo nó removido" + primeiroNo.getDado());
            if(primeiroNo == ultimoNo){
                primeiroNo = null;
                ultimoNo = null;
            }else{
                primeiroNo = primeiroNo.getNextNo();
            }
        }
    }

    public void imprimeLista(){
        if (primeiroNo == null){
            System.out.println("A lista esta vazia");
        }else{
            No<T> helper = primeiroNo;
            while (helper != null){
                System.out.println(helper.getDado());
                helper = helper.getNextNo();
            }
        }
        
    }
}