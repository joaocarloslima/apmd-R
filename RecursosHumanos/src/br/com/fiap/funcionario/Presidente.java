package br.com.fiap.funcionario;

import br.com.fiap.sistema.Autenticavel;

public final class Presidente extends Funcionario implements Autenticavel{
	
	private double valorDaCota;
	private String senha;

	public double getValorDaCota() {
		return valorDaCota;
	}

	public void setValorDaCota(double valorDaCota) {
		this.valorDaCota = valorDaCota;
	}
	
	@Override
	public double getSalario() {
		return this.getSalarioBase() + valorDaCota;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}
	
	

}
