package Banco;

import java.util.Date;

import java.util.List;
import java.util.ArrayList;
public class Credito extends Tarjeta{

	private double mCredito;
	private List <Movimiento> mMovimientos;
	
	public Credito(String num, String titu, Date fec,double cred) {
		super(num, titu, fec);
		setmCredito(cred);
		this.mMovimientos=new ArrayList <Movimiento>();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public double getmCredito() {
		return mCredito;
	}





	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	
	public void añadirMovimiento(Movimiento m)
	{
		this.mMovimientos.add(m);
	}



	public void ingresar(double x)
	{
		getmCuentaAsociada().ingresar("ingreso en cuenta", x);
		Movimiento mov=new Movimiento();
		mov.setmConcepto("Ingreso en cuenta asociada");
		mov.setmImporte(x);
		this.añadirMovimiento(mov);
		
	}
	
	
	public  double getSaldo()
	{
		return getmCuentaAsociada().getSaldo();
	}
	

	
	
	public  void pagoEnEstablecimiento(String datos, double x)
	{
		getmCuentaAsociada().retirar("Compra a credito en "+datos, x);
		//añadimos a movimientos de la tarjeta
		Movimiento mov=new Movimiento();
		mov.setmConcepto("Compra a credito en "+datos);
		mov.setmImporte(-x);
		this.añadirMovimiento(mov);
	}
	
	public  void retirar(double x)
	{
		
		getmCuentaAsociada().retirar("retiro en cuenta", x);
		Movimiento mov=new Movimiento();
		mov.setmConcepto("“Retirada en cuenta asociada");
		//comprobamos si el 5% del importe es menor a 3 euros, en caso contrario añadimos al importe el 5%
		if(x*0.05<3)
		{
			mov.setmImporte(-x-3);
		}
		else
		{
			mov.setmImporte(-x-(x*0.05));
		}
		
		this.añadirMovimiento(mov);
	}
	
	public double getCreditoDisponible()
	{
		return this.getmCredito();
	}
	
	public void liquidar(int mes,int año)
	{
		//recorrer el array list de movimientos
		
	}
	
	
	
	
	
}
