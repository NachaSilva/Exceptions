package java_pila_ejecucion;

public class Conexion implements AutoCloseable{
	
	public Conexion() {
		System.out.println("Abriendo Conexion");
		
	}
	
	public void leerDatos() {
		System.out.println("Recibiendo datos");
		throw new IllegalStateException(); //la conexion no fue exitosa, dio un error
	}
	
	  public void cerrar() {
          System.out.println("Cerrando conexion ");
      }

	@Override
	public void close() throws Exception {
		cerrar();
		
	}
	
}
