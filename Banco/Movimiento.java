package Banco;

import java.time.LocalDate;


public class Movimiento {

	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	
	public Movimiento()
	{
	    LocalDate date = LocalDate.now();
		setmFecha(date);
	}

	public String getmConcepto() {
		return mConcepto;
	}

	public void setmConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}

	public LocalDate getmFecha() {
		return mFecha;
	}

	public void setmFecha(LocalDate mFecha) {
		this.mFecha = mFecha;
	}

	public double getmImporte() {
		return mImporte;
	}

	public void setmImporte(double mImporte) {
		
		this.mImporte = mImporte;

	}
	
	
	
}
