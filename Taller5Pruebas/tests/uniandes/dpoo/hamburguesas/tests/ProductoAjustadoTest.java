package uniandes.dpoo.hamburguesas.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.ProductoAjustado;


import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ProductoAjustadoTest {

	private ProductoMenu base;
	private ProductoAjustado ajustado;

	
	@BeforeEach
	public void setUp()
	{
		base = new ProductoMenu ("Hamburguesa", 1);
		ajustado= new ProductoAjustado(base);
		
	}
	
	@Test
	public void testGetNombre()
	{
		assertEquals("Hamburguesa", ajustado.getNombre());
		
	}
	
	@Test 
	public void testGetPrecio()
	{
		assertEquals(0, ajustado.getPrecio());
	}
	@Test
	public void testGenerarTextoFactura() {
		
		String factura = ajustado.generarTextoFactura();
		
		assertTrue(factura.contains("0"));

		
	}
	
}
