package Banco;

public class MaquinaContadora {

	private long cuil;
	private Cliente[] clientes;
	private TipoDeMoneda TIPO;
	private double cantidad;

	public MaquinaContadora() {
		
		this.TIPO=null;
		this.clientes= new Cliente[100];
		this.cantidad=0;
		
	}

	public boolean comprar() {
		
	}
}
