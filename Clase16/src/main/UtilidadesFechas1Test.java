package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.vintage.engine.descriptor.RunnerTestDescriptor;

class UtilidadesFechas1Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testConvertirStringADate() {
		//Configuracion o estado incial
		String formato="yyyy-MM-dd";
		UtilidadesFechas1 util=new UtilidadesFechas1(formato);
		//Dato de prueba
		String dato="2021-12-23";
		//Resultado esperado
		Date resultadoEsperado=Date.from(LocalDateTime.of(2021, 12, 23,0,0).minusHours(1).toInstant(ZoneOffset.ofHours(0)));
		//Ejecutamos la prueba
		Date ResultadoReal=util.convertirStringADate(dato);
		//Hacemos la comprobacion
		assertEquals(resultadoEsperado, ResultadoReal);
		
		dato="2021-12-43";
		//Espero que lance una excepcion
		try {
			Date d=util.convertirStringADate(dato);
			fail("No falla con una fecha incorrecta");
		}catch(RuntimeException ex) {
			
		}
	}

	@Test
	void testValidarFormatoFecha() {
		fail("Not yet implemented");
	}

	@Test
	void testTiempoEntre2Fechas() {
		fail("Not yet implemented");
	}

	@Test
	void testUtilidadesFechas1() {
		fail("Not yet implemented");
	}

	@Test
	void testConvertirDateAString() {
		fail("Not yet implemented");
	}

}
