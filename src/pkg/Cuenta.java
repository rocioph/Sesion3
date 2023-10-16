package pkg;

public class Cuenta {

	private double saldo;
	private static final double saldomin=-500;
	
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
	public boolean Retirar(int i) 
	{
		this.setSaldo(this.getSaldo()-i);
		if(this.getSaldo()<saldomin)
		{
			return false;
		}
		else {
			return true;
		}
	}
}
