package br.com.buritech.cursojse.modelo;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Maria", 1000);

		Gerente gerente = new Gerente("Jose", 1000);
		gerente.setSenha(123456);

		System.out.println(funcionario.getNome() + " - "
				+ funcionario.getSalario());
		System.out.println(gerente.getNome() + " - " + gerente.getSalario());
	}
}
