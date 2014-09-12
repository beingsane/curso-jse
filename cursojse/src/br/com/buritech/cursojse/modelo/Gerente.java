package br.com.buritech.cursojse.modelo;

public class Gerente extends Funcionario {
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
