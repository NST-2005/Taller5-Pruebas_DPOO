
package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ProductoMenuTest {
	
	private ProductoMenu producto;
	
	@BeforeEach
	public void setUp()
	{
		producto= new ProductoMenu("Hamburguesa sencilla", 15000);
	}
	
	@Test
	public void testGetNombre()
	{
		assertEquals("Hamburguesa sencilla", producto.getNombre());
		
	}
	@Test
	public void testGetPrecio()
	{
		assertEquals(15000, producto.getPrecio());
		
	}
	@Test 
	public void testGenerarTextoFactura()
	{
		String factura = producto.generarTextoFactura();
		assertTrue(factura.contains("Hamburguesa sencilla"));
		assertTrue(factura.contains("15"));
		
	}
	
}

