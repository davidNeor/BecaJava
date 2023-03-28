package Ejercicio5_bucles;

public class Fechas {
	
	private int dia;
	private int mes;
	private int año;
	
	
	public Fechas(int d,int m, int a)
	{
		this.dia=d;
		this.mes=m;
		this.año=a;
		
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}
	
	
	public boolean version1()
	{
		if(this.dia>0&&this.dia<=30)
		{
			if(this.mes>0&&this.mes<=12)
			{
				if(this.año>0)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean version2()
	{
		
		int diasMes=0;
		switch(this.mes)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				diasMes=31;
				break;
			case 4: case 6:  case 9: case 11:
				diasMes=30;
				break;
			default:
				diasMes=28;
				
		
		}
		if(this.dia>0&&this.dia<=diasMes)
		{
			if(this.mes>0&&this.mes<=12)
			{
				if(this.año>0)
				{
					return true;
				}
			}
		}
		return false;
		
		
	}
	
	public boolean version3()
	{
		
		int[] meses= {30,28,31,30,31,30,31,31,30,31,30,31};
		if(this.dia>0&&this.dia<=meses[this.mes-1])
		{
			if(this.mes>0&&this.mes<=12)
			{
				if(this.año>0)
				{
					return true;
				}
			}
		}
		return false;
		
		
		
	}
	
	public boolean version4()
	{
		int[] meses= {30,28,31,30,31,30,31,31,30,31,30,31};
		if ((this.año % 4 == 0) && ((this.año % 100 != 0) || (this.año % 400 == 0)))
		{
			meses[1]=29;
		}
		if(this.dia>0&&this.dia<=meses[this.mes-1])
		{
			if(this.mes>0&&this.mes<=12)
			{
				if(this.año>0)
				{
					return true;
				}
			}
		}
		return false;
		
		
		
	}
	
	
	

}
