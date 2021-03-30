package br.com.fiap.sistema;

import br.com.fiap.funcionario.*;

public class TestaRH {
	
	public static void main(String[] args) {
		
		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
		
		//Funcionario funcionario = new Gerente();
		
		Gerente gerente = new Gerente();
		gerente.setSalarioBase(5000);
		gerente.setBonus(500);
		gerente.setSenha("123");
	
		
		Engenheiro engenheiro = new Engenheiro(23001, "Marcos Eugenio");
		engenheiro.setSalarioBase(4000);

		
		Presidente presidente = new Presidente();
		presidente.setSalarioBase(8000);
		presidente.setValorDaCota(2000);
		presidente.setSenha("fiap123");
		
		folhaDePagamento.logar(gerente);
		folhaDePagamento.registrar(presidente);
		folhaDePagamento.registrar(gerente);
		folhaDePagamento.registrar(engenheiro);
		
		System.out.println(folhaDePagamento.getTotalPagamento());
		

		
		
		
	}

}
