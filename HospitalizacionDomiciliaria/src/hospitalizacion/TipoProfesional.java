package hospitalizacion;


public class TipoProfesional {

	private int idTp;
	private String nombreTipoPro;
	
	
	public TipoProfesional(int idTp, String nombreTipoPro) {
		
		this.idTp = idTp;
		this.nombreTipoPro = nombreTipoPro;
	}


	public TipoProfesional() {
		
	}


	public int getIdTp() {
		return idTp;
	}


	public void setIdTp(int idTp) {
		this.idTp = idTp;
	}


	public String getNombreTipoPro() {
		return nombreTipoPro;
	}


	public void setNombreTipoPro(String nombreTipoPro) {
		this.nombreTipoPro = nombreTipoPro;
	}
	
	
}
