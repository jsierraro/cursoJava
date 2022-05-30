package org.indra.sesion15java.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class Exito {
	
	private String mensaje= "Operacion exitosa";
	@NonNull private Object resultado;
	
}
