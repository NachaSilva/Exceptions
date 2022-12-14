package java_pila_ejecucion;

public class Flujo {
	
	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			metodo1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin main");
	}
	
	private static void metodo1() throws MiException {
		System.out.println("Inicio metodo1");
		try {
			metodo2();
		} catch(MiException me){
			me.printStackTrace();
		}
		System.out.println("Fin metodo1");
	}
	
	private static void metodo2()throws MiException {
		System.out.println("Inicio metodo2");
		//ArithmeticException ae = new ArithmeticException();
		throw new MiException("Mi excepcion fue lanzada"); //lanza la bomba 
		
	
	}
}
