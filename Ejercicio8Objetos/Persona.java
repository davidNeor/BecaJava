package Ejercicio8Objetos;

public  abstract class Persona implements Salvable{

	private int id;
	private String nombre;
	
	public Persona(String nomb)
	{
		setNombre(nomb);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void imprimirQuien();
	
	public abstract String toString();
	
	
	
	
}
