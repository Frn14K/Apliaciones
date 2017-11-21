package ec.edu.ups.appdis.aplicaciones.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario 
{

	@Id
	@Column (name = "per_cedula",nullable = false) 
	private String cedula;
	private String nombre;
	private Strin fechaNa;
	
}
