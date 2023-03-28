package Ejercicio5_bucles;

public class Convierte {

	public final String[] unidades= {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
	public final String[] decenas= {"diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
	private int numero;
	
	public Convierte(int num)
	{
		this.numero=num;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void version1()
	{
		if(this.numero<10)
		{
			if(this.numero==0)
			{
				System.out.println(this.unidades[0]);
			}
			else
			{
				System.out.println(this.unidades[numero]);
			}
		}
		else
		{
			
			//ahora tendremos un numero de dos cifras
		    String numCadena= String.valueOf(this.numero);
		    
	        int primeraCifra = Character.getNumericValue(numCadena.charAt(0));        
	        int segundaCifra= Character.getNumericValue(numCadena.charAt(1));
	        
	        //si la segunda cifra es 0, nombramos directamente la decena(10,20...)
	        if(segundaCifra==0)
	        {
	        	System.out.println(this.decenas[primeraCifra-1]);
	        }
	        else
	        {
	        	System.out.println(this.decenas[primeraCifra-1]+" y "+this.unidades[segundaCifra]);
	        	
	        }
			
			
			
			
		}
		
		
		
		
	}
	
	
	public void version2()
	{
		
		if(this.numero<10)
		{
			if(this.numero==0)
			{
				System.out.println(this.unidades[0]);
			}
			else
			{
				System.out.println(this.unidades[numero]);
			}
		}
		else
		{
			
			//ahora tendremos un numero de dos cifras
		    String numCadena= String.valueOf(this.numero);
		    
	        int primeraCifra = Character.getNumericValue(numCadena.charAt(0));        
	        int segundaCifra= Character.getNumericValue(numCadena.charAt(1));
	        
	        //si la segunda cifra es 0, nombramos directamente la decena(10,20...)
	        if(segundaCifra==0)
	        {
	        	System.out.println(this.decenas[primeraCifra-1]);
	        }
	        else
	        {
	        	if(primeraCifra==1&&segundaCifra<6)
	        	{
	        		switch(segundaCifra)
	        		{
	        			case 1:
	        				System.out.println("once");
	        				break;
	        			case 2:
	        				System.out.println("doce");
	        				break;
	        			case 3:
	        				System.out.println("trece");
	        				break;
	        			case 4:
	        				System.out.println("catorce");
	        				break;
	        			case 5:
	        				System.out.println("dieciseis");
	        				break;
	        			default:
	        				
	        		}
	        		
	        	}
	        	else
	        	{
		        	System.out.println(this.decenas[primeraCifra-1]+" y "+this.unidades[segundaCifra]);

	        	}
	        	
	        }
			
			
			
			
		}
		
		
	}
	
	
	
	
	
}
