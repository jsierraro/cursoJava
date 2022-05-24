package org.indra.main;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class Automovil {

	private int id;
	@NonNull
	private String marca;
	@NonNull
	private String modelo;
	private int kilometros;

}
