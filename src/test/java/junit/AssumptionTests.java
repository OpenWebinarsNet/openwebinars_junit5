package junit;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssumptionTests {

	@Test
	@DisplayName("Assume MAL")
	void asuncionMAL() {		
		boolean verdaderoFalso = true;

		assumeFalse(verdaderoFalso);
		//A PARTIR DE AQU� S�LO SE CONTINUAR� SI LA ASUNCI�N SE CUMPLE
		
		System.out.println("Esto se imprimir� s�lo si la asunci�n se cumple (asuncionMAL)");
	}
	
	@Test
	@DisplayName("Assume OK")
	void asuncionOK() {		
		boolean verdaderoFalso = false;

		assumeFalse(verdaderoFalso);
		//A PARTIR DE AQU� S�LO SE CONTINUAR� SI LA ASUNCI�N SE CUMPLE
		
		System.out.println("Esto se imprimir� s�lo si la asunci�n se cumple (asuncionOK)");
	}
		
	@Test
	@DisplayName("AssumeThat")
	void asuncionThatMAL() {		
		
		boolean asuncion = false;
		
		assumingThat(asuncion, () -> {
			System.out.println("Esto S�LO se imprimir� cuando la asunci�n se cumpla");	
		});
		
		System.out.println("Esto se imprimir� SIEMPRE");
		
	}
	
	
	
}
