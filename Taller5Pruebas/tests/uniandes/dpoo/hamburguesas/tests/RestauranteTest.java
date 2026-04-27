package uniandes.dpoo.hamburguesas.tests;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.excepciones.*;
import uniandes.dpoo.hamburguesas.mundo.Restaurante;

public class RestauranteTest {
	
	private Restaurante restaurante;
	
	@BeforeEach
	public void setUp()
	{
		restaurante = new Restaurante();
		
	}
	
	@Test 
	public void testIniciarPedido() throws Exception
	{
		restaurante.iniciarPedido("Nata", "Calle 123");
		assertNotNull(restaurante.getPedidoEnCurso());
		assertEquals("Nata", restaurante.getPedidoEnCurso().getNombreCliente());
		
	}
	
	@Test
	public void testIniciarPedidoException() throws Exception
	{
		restaurante.iniciarPedido("Nata", "Calle123");
		assertThrows(YaHayUnPedidoEnCursoException.class,()->{
			restaurante.iniciarPedido("Otro", "Otra");
		});
	}
	
	@Test 
	public void testCerrarPedido() throws Exception
	{
		restaurante.iniciarPedido("Nata", "Calle 123");
		restaurante.cerrarYGuardarPedido();
		assertNull(restaurante.getPedidoEnCurso());
		
	}
	
	//@Test
	//public void testCargarInformacion() throws Exception
	//{
		
	
}
