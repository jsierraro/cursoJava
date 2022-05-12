package indra.banco.models;

public class Empresa extends Entidad {
	
	private String cif;
//	private String nombre;
	
	
	public String getCif() {
		return cif;
	}
	
	public Empresa(String cif, String nombre) {
		super(nombre);
		this.cif = cif;
	}
	
	

}
