package Banco;

import java.time.LocalDate;
import java.util.Date;

public class Debito extends Tarjeta {

	
	
	public Debito(String num, String titu, Date fec) {
		super(num, titu, fec);
		// TODO Auto-generated constructor stub
	}

	
	
	public void ingresar(double x)
	{
		getmCuentaAsociada().ingresar("ingreso en cajero", x);
		
		
		
		
	}
	
	
	public  double getSaldo()
	{
		//devolvemos el saldo de la cuneta asociada a la tarjeta
		return getmCuentaAsociada().getSaldo();
		
		
	}
	

	
	
	public  void pagoEnEstablecimiento(String datos, double x)
	{
		getmCuentaAsociada().retirar(datos, x);
	}
	
	public  void retirar(double x)
	{
		getmCuentaAsociada().retirar("retiro en cajero", x);;
	}
}
