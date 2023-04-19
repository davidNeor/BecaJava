package Banco;

import java.util.List;
import java.util.ArrayList;

public class Cuenta {
	
	
	private List<Movimiento> nMovimientos;
	private String mNumero;
	private String mTitular;
	
	
	
	
	public List<Movimiento> getnMovimientos() {
		return nMovimientos;
	}
	public void setnMovimientos(List<Movimiento> nMovimientos) {
		this.nMovimientos = nMovimientos;
	}
	public String getmNumero() {
		return mNumero;
	}
	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}
	public String getmTitular() {
		return mTitular;
	}
	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}
	
	public Cuenta(String num, String tit)
	{
		setmNumero(num);
		setmTitular(tit);
		this.nMovimientos=new ArrayList<Movimiento>();
	}
	
	
	public void addMovimiento(Movimiento m)
	{
		this.nMovimientos.add(m);
		
	}
	
	
	public double getSaldo()
	{
		double saldo=0;
		for(Movimiento i : this.nMovimientos) {
		      
				saldo+=i.getmImporte();
				 
		    }
		return saldo;
		
	}
	
	
	public void ingresar(String concepto,double x)
	{
		try
		{
			Movimiento mov=new Movimiento();
			if(x<0)
			{
				throw new ImporteException("El importe ha de ser mayor que 0");
			}			
			mov.setmImporte(x);
			mov.setmConcepto(concepto);
			//si el concepto es de tarjeta de debito, lo añade  a movimientos.
			if(mov.getmConcepto()=="“Ingreso en cajero automatico"||mov.getmConcepto()=="“Retirada en cajero automatico"||mov.getmConcepto()=="Compras en "+concepto)
			{
				this.addMovimiento(mov);
			}
			
		}
		catch(ImporteException e)
		{
			System.out.println(e);
		}
		
	}
	
	public void ingresar(double x)
	{
		//creo un nuevo movimiento				
				Movimiento mov=new Movimiento();				
				mov.setmImporte(x);
				mov.setmConcepto("Ingreso en ");
				this.addMovimiento(mov);

				
		
	}
	
	public void retirar(String concepto,double x)
	{
		try{
			if (x<0)
			{
				throw new ImporteException("El importe no puede ser negativo");
			}				
			else
			{
				if(this.getSaldo()<0)
				{
					throw new SaldoException("No se puede retirar con saldo negativo ");
				}
				Movimiento mov=new Movimiento();		
				mov.setmImporte(-x);				
				mov.setmConcepto("Compras en "+concepto);
				this.addMovimiento(mov);

			}
		}
		catch(ImporteException e)
		{
			System.out.println(e);
		}
		catch(SaldoException e)
		{
			System.out.println(e);
		}
		
	}
	
	public void retirar(double x)
	{

		try{
			if (x<0)
			{
				throw new ImporteException("El impoorte no puede ser negativo");
			}				
			else
			{
				if(this.getSaldo()<0)
				{
					throw new SaldoException("No se puede retirar con saldo negativo ");
				}
				Movimiento mov=new Movimiento();		
				mov.setmImporte(-x);				
				mov.setmConcepto("Compras");
				this.addMovimiento(mov);

			}
		}
		catch(ImporteException e)
		{
			System.out.println(e);
		}
		catch(SaldoException e)
		{
			System.out.println(e);
		}
		
		
	}
	
	
	public void listarMovimientos()
	{
		for(Movimiento i : this.nMovimientos) {
		      
			System.out.println("Concepto: "+i.getmConcepto()+" Importe: "+i.getmImporte()+" Fecha: "+i.getmFecha());
			 
	    }
		
	}
	
	

}
