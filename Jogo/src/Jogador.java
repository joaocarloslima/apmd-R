
public abstract class Jogador {

	private String nome;
	private int xp;
	private int hp;
	private boolean envenenado;

	public Jogador() {
		hp = 100;
		envenenado = false;
	}

	public Jogador(String nome) {
		hp = 100;
		this.nome = nome;
	}
	
	public int getXp() {
		return this.xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}

	public void receberDano(int pontos) {
		if (pontos > 0)
			hp -= pontos;
	}

	public void receberCura(int pontos) {
		if (pontos > 0)
			hp += pontos;
	}

	public void ganharExperiencia(int pontos) {
		if (pontos > 0)
			xp += pontos;
	}

	public void receberAntidoto() {
		envenenado = !envenenado;
	}

}
