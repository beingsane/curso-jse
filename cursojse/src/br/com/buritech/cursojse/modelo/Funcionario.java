package br.com.buritech.cursojse.modelo;

public class Funcionario {
	private String nome;
	private double salario;
	private int matricula;
	private static int contador;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
		matricula = ++contador;
	}
	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
