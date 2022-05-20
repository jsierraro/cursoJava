package org.indra.main;

import java.util.*;

import org.indra.services.GeografiaService;
import org.indra.services.IGeografiaService;
import org.indra.services.IPersonaService;
import org.indra.services.PersonaService;
import org.springframework.context.annotation.*;

@Configuration
public class BeanConfig {

	@Bean
	public IGeografiaService geografiaService() {
		GeografiaService service = new GeografiaService();
		service.setComunidadesAutonomas(new ArrayList<String>() {
			{
				add("Madrid");
				add("Extremadura");
				add("Asturias");
				add("Galicia");
				add("Cantabria");
			}
		});

		service.setProvincias(new HashMap<String, List<String>>() {
			{
				put("Madrid", new ArrayList<String>() {
					{
						add("Madrid");
					}
				});
				put("Extremadura", new ArrayList<String>() {
					{
						add("Caceres");
						add("Badajoz");
					}
				});
				put("Asturias", new ArrayList<String>() {
					{
						add("Asturias");
					}
				});
				put("Galicia", new ArrayList<String>() {
					{
						add("A Coruña");
						add("Lugo");
						add("Ourense");
						add("Pontevedra");
					}
				});
				put("Cantabria", new ArrayList<String>() {
					{
						add("Cantabria");
					}
				});
			}
		});

		return service;
	}

	@Bean
	public IPersonaService personaService() {
		return new PersonaService() {
			{
				setConnectionString("jdbc:sqlite:personas.db");
			}
		};
	}
}
