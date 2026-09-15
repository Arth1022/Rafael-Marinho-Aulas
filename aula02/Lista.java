package aula02;

public class Lista<T> {
    private No<T> firtNo;
    private No<T> lastNo;
    private String name;

    public Lista(String nome){
        this.name = nome;
    }

    public Lista(No<T> firtNo, No<T> lastNo, String nome ){
        this.firtNo = firtNo;
        this.lastNo = lastNo;
        this.name = nome;
    }

    public void setfirtNo(No<T> firtNo){
        this.firtNo = firtNo;
    }

    public void setlastNo(No<T> lastNo){
        this.lastNo = lastNo;
    }
    public void setname(String name){
        this.name = name;
    }

    public No<T> getfirtNo(){
        return this.firtNo;
    }

    public No<T> getlastNo(){
        return this.lastNo;
    }

    public String getName(){
        return this.name;
    }


}   
