package hospitalizacion;

import java.util.ArrayList;

public class Pedido {

     private int idPedido;
     private Paciente paciente;
     private Profesional profesional;
     private String fechaPedido;
     private String fechaEntrega;
     private ArrayList<Insumo> insumo;
     
     
	public Pedido(int idPedido, Paciente paciente, Profesional profesional, String fechaPedido, String fechaEntrega,
			ArrayList<Insumo> insumo) {
		
		this.idPedido = idPedido;
		this.paciente = paciente;
		this.profesional = profesional;
		this.fechaPedido = fechaPedido;
		this.fechaEntrega = fechaEntrega;
		this.insumo = insumo;
	}


	public int getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public Profesional getProfesional() {
		return profesional;
	}


	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}


	public String getFechaPedido() {
		return fechaPedido;
	}


	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}


	public String getFechaEntrega() {
		return fechaEntrega;
	}


	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}


	public ArrayList<Insumo> getInsumo() {
		return insumo;
	}


	public void setInsumo(ArrayList<Insumo> insumo) {
		this.insumo = insumo;
	}
	
	
     
     
	
}
