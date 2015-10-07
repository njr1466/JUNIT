import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {
	
	@Test 
	public void deveriaSomarDoisValoresPassados() throws Exception {  
		int valorA = 1; 
		int valorB = 2; 
	 
		Calculadora calculadora = new Calculadora(); 
		int soma = calculadora.soma(valorA, valorB);
		assertEquals(3, soma);
	}
	
	@Test 
	public void deveriaSubtrairDoisValoresPassados() throws Exception {  
		int valorA = 4; 
		int valorB = 1; 
	 
		Calculadora calculadora = new Calculadora(); 
		int subtracao = calculadora.subtrai(valorA, valorB);
		assertEquals(3, subtracao);
	}

}
