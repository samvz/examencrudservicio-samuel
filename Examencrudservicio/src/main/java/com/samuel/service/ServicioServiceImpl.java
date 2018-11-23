package com.samuel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.modell.Servicio;
import com.samuel.repository.ServicioRepository;

	@Service

public class ServicioServiceImpl implements ServicioService {
	
	@Autowired
	
	ServicioRepository serRepository;

	@Override
	public Servicio findById(long id) {
		return serRepository.findById(id);
	}

	@Override
	public Optional<Servicio> findByNameServicio(String nameServicio) {
		return serRepository.findByNameServicio(nameServicio);
	}

	@Override
	public void saveSer(Servicio ser) {
		serRepository.save(ser);
	}
		
	

	@Override
	public void updateSer(Servicio ser) {
		serRepository.save(ser);
		
	}

	@Override
	public void deleteSerById(long id) {
		serRepository.deleteById(id);
		
	}

	@Override
	public List<Servicio> findAllSers() {
		return serRepository.findAll();
	}

	@Override
	public void deleteAllSers() {
		serRepository.deleteAll();
		
	}

	@Override
	public boolean isSerExist(Servicio ser) {
		return findByNameServicio(ser.getNameServicio())!=null;
	}
	
	

}
