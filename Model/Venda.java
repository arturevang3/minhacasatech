package br.com.minhacasatech.model;

import java.util.Calendar;

public class Venda {
	private Cliente cliente;
	private Responsavel responsavel;
	private Equipamento equipamento;
	private int quantidade;
	private float valor;
	private Calendar dataDaVenda;
	private String tipoDePagamento;
	
	public Venda(Cliente cliente, Responsavel responsavel, Equipamento equipamento, int quantidade, float valor, Calendar dataDaVenda, String tipoDePagamento) {
		this.cliente = cliente;
		this.responsavel = responsavel;
		this.equipamento = equipamento;
		this.quantidade = quantidade;
		this.valor = valor;
		this.dataDaVenda = dataDaVenda;
		this.tipoDePagamento = tipoDePagamento;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente novo) {
		if (novo == null) {
			System.out.println("Cliente n�o foi informado, por favor informe-o.");
		} else {
			this.cliente = novo;
		}
	}
	
	public Responsavel getResponsavel() {
		return this.responsavel;
	}
	public void setResponsavel(Responsavel novo) {
		if (novo == null) {
			System.out.println("Respons�vel n�o foi informado, por favor informe-o");
		} else {
			this.responsavel = novo;
		}
	}
	
	public Equipamento getEquipamento() {
		return this.equipamento;
	}
	public void setEquipamento(Equipamento novo) {
		if (novo == null) {
			System.out.println("Equipamento n�o foi informado, por favor informe-o");
		} else {
			this.equipamento = novo;
		}
	}
	
	public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int novo){
    	if (quantidade == 0) {
    		System.out.println("A quantidade n�o foi informada, por favor informe-a.");
    	} else {
    		this.quantidade = novo;
    	}
        
    }
    
    public float getValor() {
    	return this.valor;
    }
    public void setValor(float novo) {
    	if (valor == 0) {
    		System.out.println("O valor n�o foi informado, por favor informe-o.");
    	} else {
    		this.valor = novo;
    	}
    }
    
    public Calendar getdataDaVenda() {
    	return this.dataDaVenda;
    }
    public void setdataDaVenda(Calendar novo) {
    	this.dataDaVenda = novo;
    }
    
    public String gettipoDePagamento() {
    	return this.tipoDePagamento;
    }
    
    public void settipoDePagamento(String novo) {
    	if (novo == "" || novo == null) {
    		System.out.println("O tipo de pagamento n�o foi informado, por favor informe-o.");
    	} else {
    		this.tipoDePagamento = novo;
    	}
    }
}
