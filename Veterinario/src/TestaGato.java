
public class TestaGato {
	
	public static void main(String[] args) {
		Gato felix;
		felix = new Gato();
		
		felix.cor = "preto";
		felix.genero = 'R';
		felix.tamanho = -10;
		
		felix.miar();
		felix.crescer();
		
		felix.genero = 'F';
		
		System.out.println(felix.tamanho);
		
	}

}
