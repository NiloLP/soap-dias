package com.example.demosoap;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Component;




@Component
public class CountryRepository {
	private static final Map<String, Dia> dias = new HashMap<>();

	/**
	 * 
	 */
	@PostConstruct
	public void initData() {
		Dia lunes = new Dia();
		lunes.setNombre("lunes");
		lunes.setTraductor("monday");
		dias.put(lunes.getNombre(), lunes);

		Dia martes = new Dia();
		martes.setNombre("martes");
		martes.setTraductor("tuesday");
		dias.put(martes.getNombre(), martes);

		Dia miercoles = new Dia();
		miercoles.setNombre("miercoles");
		miercoles.setTraductor("wednesday");
		dias.put(miercoles.getNombre(), miercoles);

		Dia jueves = new Dia();
		jueves.setNombre("jueves");
		jueves.setTraductor("thurday");
		dias.put(jueves.getNombre(), jueves);

		Dia viernes = new Dia();
		viernes.setNombre("viernes");
		viernes.setTraductor("friday");
		dias.put(viernes.getNombre(), viernes);

		Dia sabado = new Dia();
		sabado.setNombre("sabado");
		sabado.setTraductor("saturday");
		dias.put(sabado.getNombre(), sabado);

		Dia domingo = new Dia();
		domingo.setNombre("domingo");
		domingo.setTraductor("sunday");
		dias.put(domingo.getNombre(), domingo);
	
		
	}

	

	public static Map<String, Dia> getNombre() {
		return dias;
	}



    public io.spring.guides.gs_producing_web_service.Dia findDia(String name) {
        return null;
    }
}