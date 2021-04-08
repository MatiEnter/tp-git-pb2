package Banco;

public class Billete {

	private double valor;
	private int numeroDeSerie;
	private TipoDeMoneda TIPO;
	private double cantidad;
	public Billete(double valor, int numeroDeSerie, TipoDeMoneda TIPO) {
		this.valor=valor;
		this.numeroDeSerie=numeroDeSerie;
		this.TIPO=TIPO;
	}

	public boolean ingresoDeBilletes(double valor, int numeroDeSerie, TipoDeMoneda TIPO) {

	if (this.valor==valor&&this.numeroDeSerie==numeroDeSerie&&this.TIPO==TIPO) {
		this.cantidad++;
		return true;
	}
	return false;
}


}