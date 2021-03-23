
public class Jogo {
	public static void main(String[] args) {
		Jogador aragorn = new Jogador("Aragorn");
		
		
		System.out.println("XP=" + aragorn.getXp());
		System.out.println("HP=" + aragorn.getHp());
		
		aragorn.receberDano(10);
		aragorn.receberCura(5);
		System.out.println("HP=" + aragorn.getHp());
	}
}
