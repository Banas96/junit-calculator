import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println("Metoda testowa");
	}

	@Test
	public void testDodawaniwa() throws Exception{
		double a = 2.0;
		double b = 3.5;
		double suma1 = classUnderTest.sum(a,b);

		double c = 4.9;
		double d = 1.2;
		double suma2 = classUnderTest.sum(c,d);

		Assert.assertEquals("Błedny wynik sumowania",5.5, suma1, 0.001); // message wyświetli się jak bedzię błedny wynik, spodziewamy się 5.5, a ma zrobić suma, bład pomiaru który akceptujemy
		Assert.assertEquals("Błedny wynik sumowania",6.1, suma2, 0.001);
	}

	@Test
	public void testOdejmowania() throws Exception{
		double a = 2.0;
		double b = 3.5;
		double odejmowanie1 = classUnderTest.subtract(a,b);

		double c = 4.9;
		double d = 1.2;
		double odejmowanie2 = classUnderTest.subtract(c,d);

		Assert.assertEquals("Błedny wynik odejmowania",-1.5, odejmowanie1, 0.001);
		Assert.assertEquals("Błedny wynik odejmowania",3.7, odejmowanie2, 0.001);
	}
	@Test
	public void testMnozenia() throws Exception{
		double a = 2.0;
		double b = -3.0;
		double mnozenie1 = classUnderTest.multiply(a,b);

		double c = 5.0;
		double d = 10.0;
		double mnozenie2 = classUnderTest.multiply(c,d);

		Assert.assertEquals("Błedny wynik mnożenia",-6.0, mnozenie1, 0.001);
		Assert.assertEquals("Błedny wynik mnożenia",50.0, mnozenie2, 0.001);
	}
	@Test
	public void testDzielenia() throws Exception{
		double a = 3.0;
		double b = -3.0;
		double dzielenie1 = classUnderTest.divide(a,b);

		Assert.assertEquals("Błedny wynik dzielenia",-1.0, dzielenie1, 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDzieleniaPrzezZero() throws Exception{
		double a = 1.0;
		double b = 0.0;
		double dzielenie0 = classUnderTest.divide(a,b);

		Assert.assertEquals("Błedny wynik dzielenia",0.0, dzielenie0, 0.001);
	}
}
