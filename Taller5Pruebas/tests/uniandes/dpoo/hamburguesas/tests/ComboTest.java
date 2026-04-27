package uniandes.dpoo.hamburguesas.tests;

import uniandes.dpoo.hamburguesas.mundo.Combo;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class ComboTest {
	
	private Combo combo;
	private ProductoMenu hamburguesa;
	private ProductoMenu papas;
	private ArrayList<ProductoMenu> items;
	
	@BeforeEach
	public void setUp()
	{
		hamburguesa = new ProductoMenu("Hamburguesa", 10000);
		papas= new ProductoMenu("Papas", 5000);
		
		items= new ArrayList<>();
		items.add(hamburguesa);
		items.add(papas);
		
		combo= new Combo("Combo especial", 0.9,items);
		
	}
	
	@Test
	public void testGetNombre()
	{
		assertEquals("Combo especial", combo.getNombre());
		
	}
	
	@Test 
	public void testGetPrecio()
	{
		//precio con descuento= 13500
		assertEquals(13500, combo.getPrecio());
	}
	
	@Test
	public void testGenerarTextoFactura()

	{
		String factura = combo.generarTextoFactura();
		assertTrue (factura.contains("Combo especial"));
		assertTrue (factura.contains("0.9"));
		assertTrue (factura.contains("13500"));
		
	
	}
	
	@Test
	public void testComboVacio()
	{
		ArrayList<ProductoMenu> vacio = new ArrayList<>();
		Combo comboVacio = new Combo("Combo especial", 0.8, vacio);
		
		assertEquals(0, comboVacio.getPrecio());
		
	}
	

	

}
