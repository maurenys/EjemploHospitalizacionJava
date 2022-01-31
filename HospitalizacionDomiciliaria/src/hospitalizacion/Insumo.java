package hospitalizacion;

public class Insumo {

	private int idInsumo;
	private String nombreInsumo;
	private int costoInsumo;
	
	public Insumo(int idInsumo, String nombreInsumo, int costoInsumo) {
		
		this.idInsumo = idInsumo;
		this.nombreInsumo = nombreInsumo;
		this.costoInsumo = costoInsumo;
	}


	public Insumo( String nombreInsumo) {
		
		this.nombreInsumo = nombreInsumo;
		
	}
	
	public Insumo() {
		
	}




	public int getIdInsumo() {
		return idInsumo;
	}

	public void setIdInsumo(int idInsumo) {
		this.idInsumo = idInsumo;
	}

	public String getNombreInsumo() {
		return nombreInsumo;
	}

	public void setNombreInsumo(String nombreInsumo) {
		this.nombreInsumo = nombreInsumo;
	}

	public int getCostoInsumo() {
		return costoInsumo;
	}

	public void setCostoInsumo(int costoInsumo) {
		this.costoInsumo = costoInsumo;
	}

	
	
	
}
