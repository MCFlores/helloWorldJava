package org.jboss.as.quickstarts.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloServiceTest extends HelloService {

	@Test
	public void testCreateHelloMessage() {
		
		HelloService prueba = new HelloService();
		String resultado = prueba.createHelloMessage("Hola");
		
		assertEquals("Hola Hola!", resultado);
		//fail("Not yet implemented");
	}

}
