package org.indra.proyectoJsierra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.indra.proyectoJsierra.controller.EquipoController;
import org.indra.proyectoJsierra.models.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class ProyectoJsierraApplicationTests {

	@Test
	void pruebaAdd() {
		Equipo equipo = new Equipo();
		equipo.setNombre("Real Madrid");
		equipo.setEntrenador("Carlo Anchelotti");
		equipo.setCapitan("Marcelo");
		equipo.setPosicion(1);
		EquipoController controller = new EquipoController();
		ResponseEntity<Object> res = controller.add(equipo);
		// no me ha dado mas tiempo :(
	}
	
	@Test
	void pruebaGetAll() {
		
	}

}
