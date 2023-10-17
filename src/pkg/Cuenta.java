package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private double saldo;
	private static final double saldomin=-500;
	private double num;
	private List<Movimiento> mMovimientos;

	public Cuenta(double saldo, int numero) {
		super();
		this.saldo = saldo;
		this.num=numero;
		this.mMovimientos=new ArrayList<>();
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
		Movimiento movimiento = new Movimiento(i, TipoSigno.H, "Ingreso");
		this.mMovimientos.add(movimiento);
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
			Movimiento movimiento=new Movimiento(i,TipoSigno.D, "Retirar");
			this.mMovimientos.add(movimiento);
			return true;
		}
	}
}
