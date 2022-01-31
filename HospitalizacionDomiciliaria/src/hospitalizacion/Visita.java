package hospitalizacion;


public class Visita {

	private int idVisita;
	private String fechaVisita;
	private Paciente paciente;
	private Profesional profesional;
	private TipoProfesional tipoProfesional;
	private Procedimiento procedimiento;
	
	public Visita(int idVisita, String fechaVisita, Paciente paciente, Profesional profesional,
			TipoProfesional tipoProfesional, Procedimiento procedimiento) {
		
		this.idVisita = idVisita;
		this.fechaVisita = fechaVisita;
		this.paciente = paciente;
		this.profesional = profesional;
		this.tipoProfesional = tipoProfesional;
		this.procedimiento = procedimiento;
	}

	public Visita(int idVisita, String fechaVisita, Paciente paciente, Profesional profesional,
			TipoProfesional tipoProfesional) {
		
		this.idVisita = idVisita;
		this.fechaVisita = fechaVisita;
		this.paciente = paciente;
		this.profesional = profesional;
		this.tipoProfesional = tipoProfesional;
	}
	
	
	
	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public String getFechaVisita() {
		return fechaVisita;
	}

	public void setFechaVisita(String fechaVisita) {
		this.fechaVisita = fechaVisita;
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

	public Procedimiento getProcedimiento() {
		return procedimiento;
	}

	public void setProcedimiento(Procedimiento procedimiento) {
		this.procedimiento = procedimiento;
	}
	
	

	
}
