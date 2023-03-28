package Ejercicio5_bucles;

import java.util.Scanner;
import java.lang.Math;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio 1
		compara(10,3);
		compara(5,10);
		
		//ejercicio2
		int nota=6;
		switch(nota)
		{
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Insuficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("La nota no es válida");
		
		
		}
		
		
		//Ejercicio 3
		Fechas fecha=new Fechas(29,2,2020);
		
		if(fecha.version1())
		{
			System.out.println("La fecha es válida--Version1");
		}
		else
		{
			System.out.println("La fecha no es válida--Version1");

		}
		
		if(fecha.version2())
		{
			System.out.println("La fecha es válida--Version2");
		}
		else
		{
			System.out.println("La fecha no es válida--Version2");

		}
		
		
		if(fecha.version3())
		{
			System.out.println("La fecha es válida--Version3");
		}
		else
		{
			System.out.println("La fecha no es válida--Version3");

		}
		
		
		if(fecha.version4())
		{
			System.out.println("La fecha es válida--Version4");
		}
		else
		{
			System.out.println("La fecha no es válida--Version4");

		}
		
		
		//Ejercicio 4
		System.out.println("Ejercicio 4:");
		Convierte c1=new Convierte(30);
		Convierte c2=new Convierte(8);
		Convierte c3=new Convierte(79);
		
		
		Convierte c4=new Convierte(12);
		

		c1.version1();
		c2.version1();
		c3.version1();
		c4.version2();
		c1.version2();
		c2.version2();
		c3.version2();
		
		//ejercicio 5
		System.out.println("Ejercicio 5:");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero para saber su cuadrado, para terminar introduzca -1: ");

		int numero=0;
		do{
			
			numero=teclado.nextInt();
			if(numero!=-1)
			{
				System.out.println("El cuadrado de "+numero+" es: "+Math.pow(numero, 2));
			}
			
			
		}while(numero!=-1);
		
		//ejercicio 6
		System.out.println("Ejercicio 6:");
		
		for(int i=100;i>=0;i-=23)
		{
			System.out.println("Numero: "+i);
		}
		
		//ejercicio 7
		System.out.println("Ejercicio 7:");
		
		int contador=1;
		int multiplos=0;
		int suma=0;
		while(multiplos<5)
		{
			if(contador%5==0)
			{
				System.out.println("el número "+contador+" es múltiplo de 5");
				suma+=contador;
				multiplos++;
			}
			contador++;
		}
		System.out.println("La suma es : "+suma);
		
		//ejercicio 8
		System.out.println("Ejercicio 8:");
		int factorial=1;
		for(int i=1;i<=8;i++)
		{
			factorial*=i;
		}
		System.out.println(factorial);
		//Ejercicio 9
		System.out.println("Ejercicio 9:");
		for(int i=1;i<=10;i++)
		{
			System.out.println("");
			System.out.println("Tabla del "+i);
			System.out.println("--------------");


			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" x "+j+" = "+(i*j));

				
			}
		}
		
		
		//Ejercicio 10
		System.out.println("Ejercicio 10:");
		
		System.out.println("Introduce la longitud del lado: ");
		int longitud=teclado.nextInt();

		dibuja(longitud);
		
		//Ejercicio 11
		System.out.println("Ejercicio 11:");
		
		if(primos(11))
		{
			System.out.println("Es primo");
		}
		else
		{
			System.out.println("No es primo");

		}
		
		teclado.close();
		
		
		
	}
	
	
	public static boolean primos(int n)
	{
		
		//si es par no es primo
		if(n%2==0)
		{
			return false;
		}
		else
		{
			for(int i=3;i*i<=n;i+=2) {
		        if(n%i==0)
		            return false;
		    }
		}
		
		return true;
	}
	
	
	public static void dibuja(int lado)
	{
		for(int i=1;i<=lado;i++)
		{
			for(int j=1;j<=lado;j++)
			{
				if(j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("* ");
				}			
							
			}
			System.out.println();
		}
		
	}
	
	public static void compara(int a,int b)
	{
		
		if(a==b)
		{
			System.out.println("Son iguales");
			
		}
		else
		{
			if(a>b)
			{
				System.out.println("a es mayor que b");
				if(a%b==0)
				{
					System.out.println("a y b son multiplos");

				}else
				{
					System.out.println("no son multiplos");

				}
			}
			else
			{
				System.out.println("b es mayor que a");
				if(b%a==0)
				{
					System.out.println("a y b son multiplos");

				}else
				{
					System.out.println("no son multiplos");

				}

			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
