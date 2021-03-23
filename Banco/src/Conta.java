
public abstract class Conta{
	
	//private final static String BANCO = "Banco da FIAP";
	private int numero;
	protected double saldo;
	
	public Conta() {
		//this.BANCO = "Outro banco";
	}

	public abstract double getSaldo();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "O saldo da conta " + 
				numero + " vale " + getSaldo();
	}

}
