package org.indra.sesion15java.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class ResponseError {
	
	private String mensaje= "Operacion erronea";
	@NonNull private String detalle;
	
}
