package br.com.minhacasatech.model;

public class Usuario {
	private String login;
	private String senha;
	private String nome;
	private String cpf;
	private String email;
	
	public Usuario(String login, String senha, String nome, String cpf, String email) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("Login n�o informado, por favor informe-o.");
		} else {
			this.login = novo;
		}
	}
	
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("Senha n�o foi informada, por favor informe-a.");
		} else {
			this.senha = novo;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String novo) {
		if (novo == ""|| novo == null) {
			System.out.println("Nome n�o foi informado, por favor informe-o.");
		} else {
			this.nome = novo;
		}
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("Cpf n�o foi informado, por favor informe-o.");
		} else {
			this.cpf = novo;
		}
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("Email n�o foi informado, por favor informe-o.");
		} else {
			this.email = novo;
		}
	}

}
