package indra.banco.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Banco {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();
	

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void registrarClienteNuevo (Cliente c) {
		this.clientes.add(c);
	}
	
	public Cuenta registrarCuentaNueva (Cliente c) throws Exception{
		if (!this.clientes.contains(c)) {
			throw new Exception(String.format("El cliente %s no está registrado en el banco, por lo que no puede abrir una cuenta",c));
		}
		Cuenta cuenta= new Cuenta(generarIban(), c);
		this.cuentas.add(cuenta);
		return cuenta;
	}

	private String generarIban() {
		return UUID.randomUUID().toString();
	}
}
