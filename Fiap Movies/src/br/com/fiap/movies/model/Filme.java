package br.com.fiap.movies.model;

public class Filme {

	private String titulo;
	private String sinopse;
	private String genero;
	private String ondeAssistir;
	private boolean assistido;
	private int avaliacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getOndeAssistir() {
		return ondeAssistir;
	}

	public void setOndeAssistir(String ondeAssistir) {
		this.ondeAssistir = ondeAssistir;
	}

	public boolean isAssistido() {
		return assistido;
	}

	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + 
				", sinopse=" + sinopse + 
				", genero=" + genero + 
				", ondeAssistir=" + ondeAssistir + 
				", assistido=" + assistido + 
				", avaliacao=" + avaliacao + "]";
	}
	


}
