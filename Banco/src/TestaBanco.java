
public class TestaBanco {
	public static void main(String[] args) {
		Conta contaSalario = new Conta();
		contaSalario.setNumero(123);
		contaSalario.setSaldo(500);
		
		
		System.out.println(contaSalario);
		
		ContaVip contaVip = new ContaVip();
		contaVip.setNumero(321);
		contaVip.setSaldo(800);
		contaVip.setLimite(500);
		System.out.println(contaVip);
		
	}
}
