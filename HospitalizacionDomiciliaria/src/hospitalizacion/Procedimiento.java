package hospitalizacion;

import java.util.ArrayList;

public class Procedimiento {

	private int idProcedimientp;
	private String fechaProcedimeinto;
	private Paciente paciente;
	private Profesional profesional;
	private TipoProfesional tipoProfesional;
	private ArrayList<TipoProcedimiento> tipoProcedimiento; 
	private ArrayList<Insumo> insumo;
	
	public Procedimiento(int idProcedimientp, String fechaProcedimeinto, Paciente paciente, Profesional profesional,
			TipoProfesional tipoProfesional, ArrayList<TipoProcedimiento> tipoProcedimiento, ArrayList<Insumo> insumo) {
		
		this.idProcedimientp = idProcedimientp;
		this.fechaProcedimeinto = fechaProcedimeinto;
		this.paciente = paciente;
		this.profesional = profesional;
		this.tipoProfesional = tipoProfesional;
		this.tipoProcedimiento = tipoProcedimiento;
		this.insumo = insumo;
	}
	public int getIdProcedimientp() {
		return idProcedimientp;
	}
	public void setIdProcedimientp(int idProcedimientp) {
		this.idProcedimientp = idProcedimientp;
	}
	public String getFechaProcedimeinto() {
		return fechaProcedimeinto;
	}
	public void setFechaProcedimeinto(String fechaProcedimeinto) {
		this.fechaProcedimeinto = fechaProcedimeinto;
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
	public TipoProfesional getTipoProfesional() {
		return tipoProfesional;
	}
	public void setTipoProfesional(TipoProfesional tipoProfesional) {
		this.tipoProfesional = tipoProfesional;
	}
	public ArrayList<TipoProcedimiento> getTipoProcedimiento() {
		return tipoProcedimiento;
	}
	public void setTipoProcedimiento(ArrayList<TipoProcedimiento> tipoProcedimiento) {
		this.tipoProcedimiento = tipoProcedimiento;
	}
	public ArrayList<Insumo> getInsumo() {
		return insumo;
	}
	public void setInsumo(ArrayList<Insumo> insumo) {
		this.insumo = insumo;
	}
	
	
	
	
}
