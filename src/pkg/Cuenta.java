package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private double saldo;
	private static final double saldomin=-500;
	private int num;
	private List<Movimiento> mMovimientos;

	public Cuenta(double saldo, int numero) {
		super();
		this.saldo = saldo;
		this.setNum(numero);
		this.mMovimientos=new ArrayList<>();
		System.out.println("Cuenta " + this.getNum()+":");
		System.out.println("Saldo inicial de " + this.getSaldo()+"€");
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
		System.out.println("Ingreso de "+i+"€");
	}
	public boolean Retirar(int i)
	{
		double nuevosaldo=0;
		nuevosaldo=this.getSaldo()-i;
		if(nuevosaldo<saldomin)
		{
			System.out.println("Fondos insuficientes (" +this.getSaldo()+"€) en la cuenta "+this.getNum()+" para el reintegro de "+i+"€");
			return false;
		}
		else {
			this.setSaldo(getSaldo()-i);
			Movimiento movimiento=new Movimiento(i,TipoSigno.D, "Retirar");
			this.mMovimientos.add(movimiento);
			System.out.println("Reintegro de "+i+"€");
			return true;
		}
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
