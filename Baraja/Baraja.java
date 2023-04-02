package Baraja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;


public class Baraja {

	//la baraja es donde estén todas las cartas de la baraja, es decir lo que hay antes de empezar el juego, monton es las que se van sacando
	private Carta[] mazo;
	private List<Carta> monton;
	public final String[] palos={"espadas","bastos","oros","copas"};
	public static final int nCartas=40;
	
	public Baraja()
	{
		this.monton=new ArrayList<Carta>();
		this.mazo=new Carta[nCartas];
		
	}
	
	
	
	
	
	
	





	public Carta[] getMazo() {
		return mazo;
	}












	public void setMazo(Carta[] mazo) {
		this.mazo = mazo;
	}












	public List<Carta> getMonton() {
		return monton;
	}






	public void setMonton(List<Carta> monton) {
		this.monton = monton;
	}






	//metodo privado que incializa el mazo
	public void inicializaMazo()
	{
		//vamos a generar las 40 cartas de cada palo y meterlas al motón		
		//recorremos cada palo y añadimos cada carta de dicho palo a la baraja
		for(int i=0;i<this.palos.length;i++)
		{
			for(int j=0;j<=9;j++)
			{
				//como excluimos el 8 y el 9, si son estos números los cambiamos por 11 y 12 respectivamente
				int posicionArray=(i*10)+j;	
				
				
								
				
				if(j==7||j==8)
				{
					Carta c=new Carta(this.palos[i],(j+4));					
					this.mazo[posicionArray+1]=c;
					
				}else if(j==9)
				{
					Carta c=new Carta(this.palos[i],j+1);
					this.mazo[posicionArray-2]=c;
				}
				else
				{
					Carta c=new Carta(this.palos[i],j+1);
					this.mazo[posicionArray]=c;
					
				}
							
				
			}
		}
		
	}
	
	public void barajar()
	{
		Carta c;
		int aleatorio=0;
		//cambia de posición todas las cartas aleatoriamente
		for(int i=0;i<nCartas;i++)
		{
			aleatorio=this.generaAleatorio();
			c=this.mazo[i];
			this.mazo[i]=this.mazo[aleatorio];
			this.mazo[aleatorio]=c;
			
		}
		
		
	}
	
	
	
	public Carta siguienteCarta()
	{
		//sacamos una carta del mazo, igual que en la baraja normal, devolvemos la última
		Carta c=null;
		int tamaño=this.mazo.length;
				
		if(tamaño>0)
		{
			
			c=this.mazo[tamaño-1];
			//creamos un nuevo mazo que tendrá todas las cartas menos la que hemos sacado
			this.setMazo(Arrays.copyOfRange(this.mazo,0 , tamaño-1));
			this.monton.add(c);
			/*
			c=this.mazo.get(tamaño-1);
			this.mazo.remove(tamaño-1);
			
			*/
			
		}
		else
		{
			System.out.println("No hay más cartas");
		}
		
		return c;
		
		
	}
	
	//cuantas cartas quedan en el mazo
	public int cartasDisponibles()
	{
		
		return this.mazo.length;
		
	}
	
	//nos piden varias cartas a la vez
	public void darCartas(int n)
	{
		//primero comprobamos si quedan ese número de cartas en el mazo
		if(this.cartasDisponibles()>=n)
		{
			for(int i=1; i<=n;n++)
			{
				this.siguienteCarta();
			}
		}
		else
		{
			System.out.println("No quedan suficientes cartas en el mazo");
		}
		
		
	}
	
	//mostramos aquellas cartas que ya han salido
	public void cartasMonton()
	{
		for(Carta c:this.monton)
		{
			System.out.println(c);
		}
	}
	
	
	public void mostrarBaraja()
	{
		if(this.mazo.length>0)
		{
			for(Carta c:this.mazo)
			{
				System.out.println(c);
			}
		}
		else
		{
			System.out.println("No hay cartas que mostrar");
		}
		
		
	}
	
	
	//este metodo privado nos va a generar un aleatorio entre 1 y 40;
	private int generaAleatorio()
	{
		int rango=39;
		int aleat=(int)(Math.random()*rango)+1;
		return aleat;
		
		
	}
	
}
