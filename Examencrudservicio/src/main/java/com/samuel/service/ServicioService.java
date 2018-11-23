package com.samuel.service;

import java.util.List;
import java.util.Optional;

import com.samuel.modell.Servicio;



public interface ServicioService {

	Servicio findById(long id);
	
	Optional<Servicio> findByNameServicio(String nameServicio);
	
	void saveSer(Servicio ser);
	
	void updateSer(Servicio ser);
	
	void deleteSerById(long id);
	
	List<Servicio> findAllSers();
	
	void deleteAllSers();
	
	public boolean isSerExist(Servicio ser);

}

