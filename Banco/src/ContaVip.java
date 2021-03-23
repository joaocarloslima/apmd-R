
public class ContaVip extends Conta{

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public double getSaldo() {
		return this.saldo + this.limite;
	}
	
	
	
	
	
}
