package aula04;

public class Fila<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila(){
        this("");
    }

    public Fila(String nomefila){
        this.nomeFila = nomefila;
        this.primeiroNo = null;
        this.ultimoNo = null;
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

    public void setNome(String nome){
        this.nomeFila = nome;
    }

    public void getNomeFila(){
        return this.nomeFila;
    }


}
