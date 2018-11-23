package com.samuel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.modell.Servicio;



public interface ServicioRepository extends JpaRepository<Servicio, Long> {
	Servicio findById(long id);
	
	
	Optional<Servicio> findByNameServicio(String nameServicio);

}
