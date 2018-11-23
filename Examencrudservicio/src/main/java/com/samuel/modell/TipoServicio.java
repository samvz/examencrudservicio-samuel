package com.samuel.modell;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_servicio")
public class TipoServicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "id_tipo_servicio")
	long id;
	
	@Column(name = "name_servicio")
	String nameServicio;
	
	
	/*@OneToMany(mappedBy="tipo_servicio",cascade=CascadeType.ALL)
	private Set<Servicio> servicios;*/
	
	

	/*public Set<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}
*/
	public TipoServicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoServicio(long id, String nameServicio) {
		super();
		this.id = id;
		this.nameServicio = nameServicio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameServicio() {
		return nameServicio;
	}

	public void setNameServicio(String nameServicio) {
		this.nameServicio = nameServicio;
	}
	
	
	
	
	

}
