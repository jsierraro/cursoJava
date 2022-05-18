package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.ZoneId;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JavaTimeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testLocalDate() {
		LocalDate fecha = LocalDate.now(ZoneId.of(ZoneId.getAvailableZoneIds().stream().filter(z -> z.startsWith("Europe")).findFirst().get()));
		System.out.println(fecha);
	}

}
