package Banco;

public class Cliente {

	private String apellido;
	private String nombre;
	private long cuil;
	private boolean habilitado;

	
 	public Cliente(String apellido, String nombre, long cuil) {
 		
 		this.apellido=apellido;
 		this.nombre=nombre;
 		this.cuil=cuil;
 		this.habilitado=false;
 	}

 	public boolean darDeAlta(String apellido, String nombre, long cuil) {
 		
 		if(this.apellido==apellido&&this.nombre==nombre&&this.cuil==cuil) {
 			
 			return true;
 		}
 		return false;
 	}

}


