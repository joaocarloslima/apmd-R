package br.com.fiap.externo;

import br.com.fiap.sistema.Autenticavel;

public class Fiscal implements Autenticavel {

	private String senha;

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha==senha;
	}

	

}
