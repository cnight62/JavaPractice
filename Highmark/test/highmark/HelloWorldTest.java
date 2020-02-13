package highmark;
import org.junit.Test;

import highmark.HelloWorld;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
/**
 * Test class for HelloWorld
 */
public class HelloWorldTest {
	
	//Instance of HelloWorld for testing
	HelloWorld helloWorld = new HelloWorld();
	
	/**
	 * Tests HelloWorld testMethod()
	 */
	@Test
	public void testHelloWorld() {
		helloWorld.testMethod();
	}
	/**
	 * Tests HelloWorld basicIntOperation()
	 */
	@Test
	public void testBasicIntOperation() {
		assertEquals(33, helloWorld.basicIntOperation());
	}
	/**
	 * Tests HelloWorld basicDoubleOperation()
	 */
	@Test
	public void testBasicDoubleOperation() {
		assertEquals(new BigDecimal(30.0000003d), helloWorld.basicDoubleOperation());
	}
	/**
	 * Tests HelloWorld trueAndTrue()
	 */
	@Test
	public void testTrueAndTrue() {
		assertTrue(helloWorld.trueAndTrue());
	}
	/**
	 * Tests HelloWorld falseAndTrueAndTrue()
	 */
	@Test
	public void testFalseAndTrueAndTrue() {
		assertTrue(helloWorld.falseAndTrueAndTrue());
	}
	/**
	 * Tests HelloWorld falseOrFalse()
	 */
	@Test
	public void testFalseOrFalse() {
		assertFalse(helloWorld.falseOrFalse());
	}
	/**
	 * Tests HelloWorld fahrenheitToCelsius()
	 */
	@Test
	public void testFahrenheitToCelsius() {		
		assertEquals(new BigDecimal(( 5 *(75d - 32.0)) / 9.0), helloWorld.fahrenheitToCelsius(new BigDecimal(75d)));		
	}
	/**
	 * Tests HelloWorld inchesToMeters()
	 */
	@Test
	public void testInchesToMeters() {
		assertEquals((new BigDecimal(3d).multiply(new BigDecimal(0.0254d))), helloWorld.inchesToMeters(new BigDecimal(3d)));
	}	
	/**
	 * Tests HelloWorld inchesToMeters()
	 */
	@Test
	public void convertMinutesIntoNumberOfYearsAndDays() {
		assertEquals(16, helloWorld.addAllIntegersBetweenZeroAndOneThousand(565));
	}
	/**
	 * Tests HelloWorld convertMinutesIntoNumberOfYearsAndDays()
	 */
	@Test
	public void testConvertMinutesIntoNumberOfYearsAndDays() {

		Object[] yearsAndDays = new Object[2];
		yearsAndDays[0] = 6;
        yearsAndDays[1] = 210;
        Object[] resultYearsAndDays = helloWorld.convertMinutesIntoNumberOfYearsAndDays(3456789);
		assertEquals(new Long(6), resultYearsAndDays[0]);
		assertEquals(new Integer(210), resultYearsAndDays[1]);
	}
	/**
	 * Presently unable to retrieve full all Mockito files from official site
	 */
//	@Test
//	public void testRetrieveTheCurrentTimeInGMT() {
//		//assertEquals("23:40:24", helloWorld.retrieveTheCurrentTimeInGMT(256));
//	}
	/**
	 * Tests HelloWorld computeBodyMassIndex();
	 */
	@Test
	public void testComputeBodyMassIndex() {
		assertEquals(new Double(25.4231715842464d), helloWorld.computeBodyMassIndex(62d, 139d));
	}
	/**
	 * Tests HelloWorld convertDistanceAndTimeToSpeed();
	 */
	@Test
	public void testConvertDistanceAndTimeToSpeed() {
		
		Float[] returnValues = new Float[3];
		returnValues[0] = 0.11691531f;
		returnValues[1] = 0.42089513f;
		returnValues[2] = 0.26158804f;
		
		Float[] testReturnValues = helloWorld.convertDistanceAndTimeToSpeed(2500f, 5f, 56f, 23f);
		assertEquals(returnValues[0], testReturnValues[0]);
		assertEquals(returnValues[1], testReturnValues[1]);
		assertEquals(returnValues[2], testReturnValues[2]);
	}
	/**
	 * Tests HelloWorld convertToSquareCubeAndFourthPower();
	 */
	@Test
	public void testConvertToSquareCubeAndFourthPower() {
		
		Double[] returnValues = new Double[3];
		
		returnValues[0] = new Double(4d);
		returnValues[1] = new Double(8d);
		returnValues[2] = new Double(16d);
		
		Double[] testReturnValues = helloWorld.convertToSquareCubeAndFourthPower(2d);
		assertEquals(returnValues[0], testReturnValues[0]);
		assertEquals(returnValues[1], testReturnValues[1]);
		assertEquals(returnValues[2], testReturnValues[2]);
	}

}
