package br.com.buritech.cursojse.modelo;

public class TestaMatricula {
	public static void main(String[] args) {
		Funcionario a = new Funcionario("Maria", 1000);
		Funcionario b = new Funcionario("José", 1000);
		Funcionario c = new Funcionario("Joao", 1000);
		Funcionario d = new Funcionario("Marcos", 1000);
		Funcionario e = new Gerente("Itamar", 1000);
		Gerente f = new Gerente("Josefa", 1000);
		
		System.out.println(a.getMatricula());
		System.out.println(b.getMatricula());
		System.out.println(c.getMatricula());
		System.out.println(d.getMatricula());
		System.out.println(e.getMatricula());
		System.out.println(f.getMatricula());
	}
}
