package br.com.buritech.cursojse.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.buritech.cursojse.modelo.Cliente;
import br.com.buritech.cursojse.modelo.ContaBancaria;

public class TelaPrincipal {
	private List<Cliente> listaDeClientes = new ArrayList<Cliente>();
	private List<ContaBancaria> listaDeContas = new ArrayList<ContaBancaria>();

	public List<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	public List<ContaBancaria> getListaDeContas() {
		return listaDeContas;
	}

	public static void main(String[] args) {
		String menu = "(1) Cadastrar clientes\n" + "(2) Cadastrar contas\n"
				+ "(3) Listar clientes\n" + "(4) Listar contas\n" + "(0) Sair";
		int opcao = 1;
		TelaPrincipal tela = new TelaPrincipal();
		System.out.println("Inicio de programa");
		while (opcao != 0) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			System.out.println("Opcao: " + opcao);
			switch (opcao) {
			case 1:
				tela.cadastrarCliente();
				break;
			case 2:
				tela.cadastrarConta();
				break;
			case 3:
				tela.listarCliente();
				break;
			case 4:
				tela.listarConta();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;
			}
		}
		System.out.println("Fim de programa");
	}

	private void listarConta() {
		String resultado = "";
		for (ContaBancaria conta : listaDeContas) {
			resultado += conta + "\n";
		}

		JOptionPane.showMessageDialog(null, resultado);
	}

	private void listarCliente() {
		String resultado = "";
		for (Cliente cliente : listaDeClientes) {
			resultado += cliente + "\n";
		}

		JOptionPane.showMessageDialog(null, resultado);
	}

	private void cadastrarConta() {
		ContaBancaria conta;
		double valor = 0;
		valor = Double
				.parseDouble(JOptionPane.showInputDialog("Saldo inicial"));
		conta = new ContaBancaria(valor);
		String cpf = JOptionPane.showInputDialog("CPF do cliente");
		Cliente cliente = buscarCliente(cpf);
		if (cliente == null) {
			JOptionPane.showMessageDialog(null, "CPF não encontrado");
		} else {
			JOptionPane.showMessageDialog(null, "Sucesso");
			conta.setTitular(cliente);
			listaDeContas.add(conta);
		}
	}

	private Cliente buscarCliente(String cpf) {
		for (Cliente cliente : listaDeClientes) {
			if (cliente.getCpf().equals(cpf)) {
				return cliente;
			}
		}
		return null;
	}

	private void cadastrarCliente() {
		Cliente cliente = new Cliente();
		cliente.setCpf(JOptionPane.showInputDialog("CPF"));
		cliente.setNome(JOptionPane.showInputDialog("Nome"));
		listaDeClientes.add(cliente);
	}

}
