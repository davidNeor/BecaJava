package Ejercicio8Objetos;

public class Usuario extends Persona{
	
	private String codigo;
	private String contraseña;
	
	public Usuario(String codigo,String nombre,String contraseña)
	{
		super(nombre);
		setCodigo(codigo);
		setContraseña(contraseña);
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public void imprimirQuien()
	{
		System.out.println(this.getNombre());
	}
	
	public String toString()
	{
		return "Nombre: "+this.getNombre()+" con codigo: "+this.getCodigo();
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
