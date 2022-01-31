package hospitalizacion;

public class TipoProcedimiento {

	private int idTipoProcedimiento;
	private String descripcionPro;
	
	public TipoProcedimiento(int idTipoProcedimiento, String descripcionPro) {
		
		this.idTipoProcedimiento = idTipoProcedimiento;
		this.descripcionPro = descripcionPro;
	}

	public int getIdTipoProcedimiento() {
		return idTipoProcedimiento;
	}

	public void setIdTipoProcedimiento(int idTipoProcedimiento) {
		this.idTipoProcedimiento = idTipoProcedimiento;
	}

	public String getDescripcionPro() {
		return descripcionPro;
	}

	public void setDescripcionPro(String descripcionPro) {
		this.descripcionPro = descripcionPro;
	}
	
	
	
	
}
