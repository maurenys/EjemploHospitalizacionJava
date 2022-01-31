package hospitalizacion;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
			
				Paciente paciente1 = new Paciente(25262517-8,"Andres");
				Paciente paciente2 = new Paciente(5841033-4,"Maria");
				
				Insumo insumo1 = new Insumo(1, "Gasas", 1500);
				Insumo insumo2 = new Insumo(2, "Soluciones", 1000);
				
				Profesional profesional1 = new Profesional(18980768-6, "Francisca");
				Profesional profesional2 = new Profesional(20524141-9, "Mario");
		        TipoProfesional tipoProfesional1 = new TipoProfesional(1,"Enfermera");
		        TipoProfesional tipoProfesional2 = new TipoProfesional(2,"Medico");
		        
		        TipoProcedimiento tipoProcedimiento1 = new TipoProcedimiento(1,"Curacion en la zona sacra.");
		       
		        Procedimiento procedimiento1 = new Procedimiento
		        		(       1, 
		        				"14-01-2022",
		        				paciente1, 
		        				profesional1, 
		        				tipoProfesional1, 
		        				new ArrayList<TipoProcedimiento>(), 
		        				new ArrayList<Insumo>());
		        		
		        		procedimiento1.getTipoProcedimiento().add(tipoProcedimiento1);
		        		procedimiento1.getInsumo().add(insumo1);
		        		procedimiento1.getInsumo().add(insumo2);
		        		String procedimientos = "";
		        		for (int i=0; i < procedimiento1.getTipoProcedimiento().size(); i++) {
		        			procedimientos = procedimientos + procedimiento1.getTipoProcedimiento().get(i).getDescripcionPro() + " ";
		        		}
		       
		    
				         			
		     System.out.println("----------------------------------------------");
		     System.out.println("             Planilla De Paciente              ");
		     System.out.println("----------------------------------------------");   		   		
		     System.out.println("Paciente: " + procedimiento1.getPaciente().getNombre()+" " +  "Rut : " +procedimiento1.getPaciente().getRut()+
		     " " + 
		     "\nAtendido por:  "+ procedimiento1.getTipoProfesional().getNombreTipoPro()  + "  "  + procedimiento1.getProfesional().getNombre() +
		     "\nProcedimiento a realizar:  " + procedimientos+ 
		     "\nCantidad de insumos a utilizar : " + procedimiento1.getInsumo().size());
		     
		     
		     
		     
		     System.out.println("----------------------------------------------");
		     System.out.println("            INSUMOS                           ");
		     System.out.println("----------------------------------------------"); 
		      
		     List<Insumo> insumoDisponble = new ArrayList<>();
				
				Insumo i1 = new Insumo("");
				i1.setNombreInsumo("1- Gasas.");
				
				Insumo i2 = new Insumo("");
				i2.setNombreInsumo("2- Solucion 09%.");
				
				Insumo i3 = new Insumo("");
				i3.setNombreInsumo("3- Aposito de Alginato de Plata.");
				
				Insumo i4 = new Insumo("");
				i4.setNombreInsumo("4- Kit de curacion esteril.");
				
				insumoDisponble.add(i1);
				insumoDisponble.add(i2);
				insumoDisponble.add(i3);
				insumoDisponble.add(i4);
				
				for (Insumo insumos : insumoDisponble) {
		            System.out.println(insumos.getNombreInsumo());
				}     		 
			
				 System.out.println("----------------------------------------------");
			     System.out.println("             VISITA              ");
			     System.out.println("----------------------------------------------"); 
			     Visita visita1 = new Visita(1,"23-03-2022", paciente1, profesional2, tipoProfesional2) ;
			     System.out.println("Fecha: " + visita1.getFechaVisita()+" " +
			                        "\nProfesional : " + visita1.getProfesional().getNombre()+
					                "\nEspecialidad: " + visita1.getTipoProfesional().getNombreTipoPro()+
					                "\nMotivo : Visita medica del mes.  ");
			     
			     
			     System.out.println("----------------------------------------------");
			     System.out.println("           PEDIDO DE LA SEMANA                ");
			     System.out.println("----------------------------------------------"); 
			     Pedido pedido1 = new Pedido(1, paciente1, profesional1, "24-01-2022","26-01-2022",new ArrayList<Insumo>());
			     
			     List<String> pedidoSemana;
				 pedidoSemana = new ArrayList<>();
					
				 pedidoSemana.add("Guantes esteriles");
				 pedidoSemana.add("Gasas esteriles");
				 pedidoSemana.add("Algodon");
				 pedidoSemana.add("Jeringas 10cc");
					
					System.out.println("Fecha pedido: " + pedido1.getFechaPedido()+" " +
	                        "\nFecha de entrega : " +pedido1.getFechaEntrega()+
			                "\nPaciente: " + pedido1.getPaciente().getNombre()+
			                "\nRealizado por : " + pedido1.getProfesional().getNombre() +
			                "\nInsumos : " + pedidoSemana);	    
	}
} 


