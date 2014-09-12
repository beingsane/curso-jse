package br.com.buritech.cursojse.modelo;

public class ContaBancaria {
	private Cliente titular;
	private double saldo;
	
	public ContaBancaria(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "saldo: "+saldo+" - "+titular;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
}
