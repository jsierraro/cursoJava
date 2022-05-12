package indra.banco.models;

public class Cuenta {

	private String iban;
	private Cliente titular;
	private double saldo = 0.0;
	
	public Cuenta(String iban, Cliente titular) {
		super();
		this.iban = iban;
		this.titular = titular;
	}
	
	public String getIban() {
		return iban;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void ingresar (double cantidad) {
		this.saldo += cantidad;
	}
	
	public void retirar (double cantidad) throws Exception{
		if(cantidad > saldo) {
			throw new Exception("No hay suficiente saldo en la cuenta para la cantidad requerida.");
		}
		this.saldo -= cantidad;
	}
}
