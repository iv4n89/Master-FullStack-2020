package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.FechaUtils;

class FechaUtilsTest {

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
	void testConvertirFechaAString() {
		//Dato:
		Date fecha=FechaUtils.obtenerDate(2020, 12, 12);
		String esperado=null;
		String real=null;
		
		//prueba1 -> string correcta
		System.out.println(esperado=FechaUtils.convertirFechaAString(FechaUtils.obtenerDate(2020, 12, 12)));
		System.out.println(real=FechaUtils.convertirFechaAString(fecha));
		assertEquals(esperado,real);
		
		//prueba2 -> fecha incorrecta
		fecha=FechaUtils.obtenerDate(2020, 15, 40);
		try {
			System.out.println(esperado=FechaUtils.convertirFechaAString(FechaUtils.obtenerDate(2020, 15, 40)));
		}catch(RuntimeException ex) {
			System.out.println("fallo");
		}
		try {
			System.out.println(real=FechaUtils.convertirFechaAString(fecha));
		}catch(RuntimeException ex) {
			System.out.println("fallo");
		}
		assertEquals(esperado,real);
	}

	@Test
	void testObtenerDate() {
		final String MESSAGE="Debe estar dando excepcion";
		
		//estado inicial
		int year=2020;
		int month=12;
		int day=12;
		
		Date esperado=null;
		Date real=null;
	
		//prueba1 -> fecha correcta
		esperado=FechaUtils.obtenerDate(2020, 12, 12);
		real= FechaUtils.obtenerDate(year, month, day);
		assertEquals(esperado, real);
		
		//prueba2 -> mes y dia negativos
		year=111111;
		month=-1;
		day=-1;
		
		esperado=FechaUtils.obtenerDate(111111, -1, -1);
		real=FechaUtils.obtenerDate(year, month, day);
		assertEquals(esperado,real,MESSAGE);
		
		
		//prueba3 -> mes y dia incorrectos
		year = 1;
		month=16;
		day=40;
		
		esperado=FechaUtils.obtenerDate(year, month, day);
		real=FechaUtils.obtenerDate(year, month, day);
		assertEquals(esperado,real,MESSAGE);
		
		//prueba4 -> año muy alto
		year=1112222223;
		month=11;
		day=11;
		esperado=FechaUtils.obtenerDate(1112222223, 11, 11);
		real=FechaUtils.obtenerDate(year, month, day);
		assertEquals(esperado,real);
	}
	
	@Test
	void testValidarDatosFecha() {
		//estado inicial
		int year=2020;
		int month=12;
		int day=12;
		
		boolean esperado;
		boolean real;
		
		//prueba1 -> fecha correcta
		System.out.println(esperado=FechaUtils.validarDatosFecha(year, month, day));
		System.out.println(real=FechaUtils.validarDatosFecha(year, month, day));
		assertEquals(esperado,real);
		
		//prueba2 -> datos negativo
		year=-1;
		month=-1;
		day=-1;
		System.out.println(esperado=FechaUtils.validarDatosFecha(-1, -1, -1));
		System.out.println(real=FechaUtils.validarDatosFecha(year, month, day));
		assertEquals(esperado,real);
		
		//prueba3 -> mes o dia incorrectos
		year=1;
		month=17;
		day=40;
		System.out.println(esperado=FechaUtils.validarDatosFecha(1, 17, 40));
		System.out.println(real=FechaUtils.validarDatosFecha(year, month, day));
		assertEquals(esperado,real);
	}

}
