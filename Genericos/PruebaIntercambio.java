package Genericos;

public class PruebaIntercambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intercambio <String> inter=new <String>Intercambio();
		inter.setEle1("elemento primero");
		inter.setEle2("elemento segundo");
		inter.invierte();
		System.out.println(inter.getEle1());
		System.out.println(inter.getEle2());

	
	
	
	}
	
	

}
