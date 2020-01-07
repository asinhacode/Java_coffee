package one;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMain 
{
	@Test
	public void shouldReturnHello()
	{
		 Main m = new Main();
		 assertEquals("Welcome!", m.returnMessage());

	}
  
  @Test
	public void shouldReturnName()
	{
		Main m = new Main("Anupam");
		assertEquals("Anupam", m.returnUserName());
				
	}
}
