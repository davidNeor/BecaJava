package Ejercicio8Objetos;

public class Cliente extends Persona {

	private int numero;
	private String nif;
	
	public Cliente(String nombre,int numero,String nif)
	{
		super(nombre);
		setNumero(numero);
		setNif(nif);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public void imprimirQuien()
	{
		System.out.println(this.getNombre());
	}
	
	public String toString()
	{
		return "Nombre: "+this.getNombre()+" con numero: "+this.getNumero()+" y nif: "+this.getNif();
	}
	
	//implementamos los metodos de la interfaz
	
	public void leer()
	{
		System.out.println("Se supone que está leido");
	}
	
	
	public void salvar()
	{
		System.out.println("Se supone que está salvado");
	}
	
}
