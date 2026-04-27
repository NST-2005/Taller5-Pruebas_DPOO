package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;

//import java.io.File;
//import java.nio.file.Files;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Pedido;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class PedidoTest {
	
	private Pedido pedido;
	private ProductoMenu hamburguesas;
	private ProductoMenu papas;
	
	@BeforeEach
	public void setUp()
	{
		pedido = new Pedido ("Nata", "Calle 123");
		hamburguesas= new ProductoMenu("Hamburguesa", 10000);
		papas= new ProductoMenu("Papas", 5000);
		
		
	}
	
	@Test 
	public void testGetNombreCliente()
	{
		assertEquals("Nata", pedido.getNombreCliente());
		
	}
	
	@Test 
	public void testAgregarProductoYPrecioTotal()
	{
		pedido.agregarProducto(hamburguesas);
		pedido.agregarProducto(papas);
		
		assertEquals(17850, pedido.getPrecioTotalPedido());
		
	}
	
	@Test 
	public void testGenerarTextoFactura()
	{
		pedido.agregarProducto(hamburguesas);
		pedido.agregarProducto(papas);
		
		String factura = pedido.generarTextoFactura();

		
		assertTrue(factura.contains("Cliente: Nata"));
		assertTrue(factura.contains("Dirección: Calle 123"));
		assertTrue(factura.contains("Hamburguesa"));
		assertTrue(factura.contains("10000"));
		assertTrue(factura.contains("Papas"));
		assertTrue(factura.contains("5000"));
		assertTrue(factura.contains("Precio Neto:"));
		assertTrue(factura.contains("15000"));
		assertTrue(factura.contains("IVA"));
		assertTrue(factura.contains("2850"));
		assertTrue(factura.contains("Precio Total"));
		assertTrue(factura.contains("17850"));
		
	}
	
	}
