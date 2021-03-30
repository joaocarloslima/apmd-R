package br.com.fiap.sistema;

import br.com.fiap.funcionario.Funcionario;

public class FolhaDePagamento {
	
	private double totalPagamento;

	public double getTotalPagamento() {
		return totalPagamento;
	}
	
	public void registrar(Funcionario funcionario) {
		totalPagamento = totalPagamento + funcionario.getSalario();
	}
	
	public void logar(Autenticavel usuario) {
		if (usuario.autenticar("123")) { 
			System.out.println("Acesso permitido");
		}else {
			System.out.println("Acesso negado");
		}
	}

	

}
