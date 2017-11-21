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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}
