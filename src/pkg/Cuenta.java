package pkg;

public class Cuenta {

	private double saldo;
	private static final double saldomin=-500;
	private double num;
	
	public Cuenta(double saldo, int numero) {
		super();
		this.saldo = saldo;
		this.num=numero;
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
		double nuevosaldo=0;
		nuevosaldo=this.getSaldo()-i;
		if(nuevosaldo<saldomin)
		{
			return false;
		}
		else {
			this.setSaldo(getSaldo()-i);
			return true;
		}
	}
}
