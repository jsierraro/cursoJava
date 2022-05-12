package org.indra.model;

import java.util.regex.Pattern;

public class ModerarComentariosPoliticos implements IEstrategiaModeracion{

	@Override
	public boolean esAPropiado(String texto) {
		return !Pattern.matches("(democrata|liberal|fascista)",texto);
	}
	
}
