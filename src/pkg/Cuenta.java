package pkg;

public class Cuenta {

	private double saldo;
	
	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void ingresar(int i) {
		// TODO Auto-generated method stub
		this.setSaldo(this.getSaldo()+i);
	}
	public void Retirar(int i)
	{
		this.setSaldo(this.getSaldo()-i);
	}
}
