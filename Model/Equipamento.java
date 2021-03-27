package br.com.minhacasatech.model;

public class Equipamento{

    private String nome;
    private float peso;
    private String serie;
    private int quantidade;
    private float preco;
    private Local local;
    private Responsavel responsavel;
    private Fornecedor fornecedor;
    
    public Equipamento(String nome,float peso,String serie,int quantidade,float preco,Local local,Responsavel responsavel,Fornecedor fornecedor) {
        this.nome = nome;
        this.peso = peso;
        this.serie = serie;
        this.quantidade = quantidade;
        this.preco = preco;
        this.local = local;
        this.responsavel = responsavel;
        this.fornecedor = fornecedor;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String novo){
        if (novo == "" || novo == null){
            System.out.println("O nome n�o foi informado, por favor informe o nome.");
        } else{
            this.nome = novo;
        }
        
    }

    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float novo){
        if (peso == 0){
            System.out.println("O peso n�o foi informado, por favor informe o peso");
        } else{
            this.peso = novo;
        }
        
    }

    public String getSerie(){
        return this.serie;
    }
    public void setSerie(String novo){
        if (novo == "" || novo == null){
            System.out.println("A s�rie n�o foi informada, por favor informe a s�rie.");
        } else{
            this.serie = novo;
        }
        
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int novo){
    	if (quantidade == 0) {
    		System.out.println("A quantidade n�o foi informada, por favor informe a quantidade.");
    	} else {
    		this.quantidade = novo;
    	}
        
    }
    
    public float getPreco() {
    	return this.preco;
    }
    public void setPreco(float novo) {
    	if (preco == 0) {
    		System.out.println("O pre�o n�o foi informado, por favor informe o pre�o");
    	} else {
    		this.preco = novo;
    	}
    }

    public Local getLocal(){
        return this.local;
    }
    public void setLocal(Local novo){
    	if (novo == null) {
    		System.out.println("O local n�o foi informado, por favor informe o local.");
    	} else {
    		this.local = novo;
    	}
        
    }

    public Responsavel getResponsavel(){
        return this.responsavel;
    } 
    public void setResponsavel(Responsavel novo){
    	if (novo == null) {
    		System.out.println("O respons�vel n�o foi informado, por favor informe o respons�vel.");
    	} else {
    		this.responsavel = novo;
    	}
        
    }

    public Fornecedor getFornecedor(){
        return this.fornecedor;
    }
    public void setFornecedor(Fornecedor novo){
    	if (novo == null) {
    		System.out.println("O fornecedor n�o foi informado, por favor informe o fornecedor.");
    	} else {
    		this.fornecedor = novo;
    	}
        
    }
}
