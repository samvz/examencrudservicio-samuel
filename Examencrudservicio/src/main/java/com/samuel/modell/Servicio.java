package com.samuel.modell;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="servicio")

public class Servicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	@Column(name = "id_servicio")
	long id;
	
	@Column(name = "name_servicio")
	String nameServicio;
	
	@Column(name = "ancho_bando")
	long anchoBando;
	
	@Column(name = "precio_servicio")
	Double precioServicio;
	
	@Column(name = "costo_instalación")
	Double costoInstalación;
	
	@ManyToOne
	@JoinColumn(name = "tipo_servicio_id_tipo_servicio")
	private TipoServicio tipoServicio;
	
	
	

	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Servicio(long id, String nameServicio, long anchoBando, Double precioServicio, Double costoInstalación,
			TipoServicio tipoServicio) {
		super();
		this.id = id;
		this.nameServicio = nameServicio;
		this.anchoBando = anchoBando;
		this.precioServicio = precioServicio;
		this.costoInstalación = costoInstalación;
		this.tipoServicio = tipoServicio;
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

	public long getAnchoBando() {
		return anchoBando;
	}

	public void setAnchoBando(long anchoBando) {
		this.anchoBando = anchoBando;
	}

	public Double getPrecioServicio() {
		return precioServicio;
	}

	public void setPrecioServicio(Double precioServicio) {
		this.precioServicio = precioServicio;
	}

	public Double getCostoInstalación() {
		return costoInstalación;
	}

	public void setCostoInstalación(Double costoInstalación) {
		this.costoInstalación = costoInstalación;
	}

	public TipoServicio getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	
	
	
	
	


}
