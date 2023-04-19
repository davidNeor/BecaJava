package Banco;

import java.util.Date;

public abstract class Tarjeta {

	private Cuenta mCuentaAsociada;
	private Date mFechaCaducidad;
	private String mNumero;
	private String mtitular;
	
	
	public Tarjeta(String num,String titu,Date fec)
	{
		setmNumero(num);
		setMtitular(titu);
		setmFechaCaducidad(fec);
		
	}


	
	
	public Cuenta getmCuentaAsociada() {
		return mCuentaAsociada;
	}




	public void setmCuentaAsociada(Cuenta mCuentaAsociada) {
		this.mCuentaAsociada = mCuentaAsociada;
	}




	public Date getmFechaCaducidad() {
		return mFechaCaducidad;
	}




	public void setmFechaCaducidad(Date mFechaCaducidad) {
		this.mFechaCaducidad = mFechaCaducidad;
	}




	public String getmNumero() {
		return mNumero;
	}




	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}




	public String getMtitular() {
		return mtitular;
	}




	public void setMtitular(String mtitular) {
		this.mtitular = mtitular;
	}


	
	public abstract double getSaldo();
	

	public abstract void ingresar(double x);
	
	public abstract void pagoEnEstablecimiento(String datos, double x);
	
	public abstract void retirar(double x);
	
	public void setCuenta(Cuenta c)
	{
		setmCuentaAsociada(c);
	}
	
	

}
