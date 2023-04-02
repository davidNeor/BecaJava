package Baraja;

public class Carta {

	private String palo;
	private int numero;
	
	
	public Carta(String pal,int num)
	{
		setPalo(pal);
		setNumero(num);
		
	}


	public String getPalo() {
		return palo;
	}


	public void setPalo(String palo) {
		this.palo = palo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	@Override
	public String toString()
	{
		return "numero= "+this.getNumero()+" , palo= "+this.getPalo();
	}
	
	
}
