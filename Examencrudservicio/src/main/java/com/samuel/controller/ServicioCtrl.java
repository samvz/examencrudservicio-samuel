package com.samuel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.modell.Servicio;
import com.samuel.service.ServicioService;

@RestController
@RequestMapping(value="/api/ser")

public class ServicioCtrl {
	
@Autowired
	
	ServicioService serService;
	
	@GetMapping(value="/all")
 protected List<Servicio> allSer(){
	 return serService.findAllSers();
 } 
	@PostMapping("/ifexist")
 protected boolean isExistCli(@RequestBody Servicio ser){
	 return serService.isSerExist(ser);
 }
	
	@PostMapping(value="/save")
 protected void save(@RequestBody Servicio ser){
		
		if(serService.isSerExist(ser)) {
			serService.updateSer(ser);
			System.out.println("el servicio ha sido actualizado");
			
		}else {
			serService.saveSer(ser);
			System.out.println("el servicio ha sido creado");
		}
		serService.saveSer(ser);
	 
 }
	@GetMapping(value="/update")
 protected String update(){
	 return "Welcome a spring boot";
 }	
	@DeleteMapping(value="/delete")
 protected String delete(){
	 return "Welcome a spring boot";
 }	

}
