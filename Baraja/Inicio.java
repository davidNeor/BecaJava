package Baraja;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Baraja bar=new Baraja();
		bar.inicializaMazo();
		bar.mostrarBaraja();
		bar.barajar();
		System.out.println("Cartas barajadas:  ");
		bar.mostrarBaraja();
		System.out.println(bar.siguienteCarta());
		System.out.println(bar.cartasDisponibles());
		System.out.println(bar.siguienteCarta());
		System.out.println(bar.cartasDisponibles());
		bar.cartasMonton();
		
		
	}

}
