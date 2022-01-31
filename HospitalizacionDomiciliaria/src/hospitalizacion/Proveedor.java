package hospitalizacion;

public class Proveedor {
	
	
	private String rutProveedor;
	private String nombreProveedor;
	
	
	public Proveedor(String rutProveedor, String nombreProveedor) {
		
		this.rutProveedor = rutProveedor;
		this.nombreProveedor = nombreProveedor;
	}


	public String getRutProveedor() {
		return rutProveedor;
	}


	public void setRutProveedor(String rutProveedor) {
		this.rutProveedor = rutProveedor;
	}


	public String getNombreProveedor() {
		return nombreProveedor;
	}


	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	
	
	
	
	
}
