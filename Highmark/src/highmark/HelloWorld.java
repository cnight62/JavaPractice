package highmark;

import java.math.BigDecimal;

public class HelloWorld {
	
	public String testMethod(){
	    return "Welcome to the Site<BR>Guest";	    
	}
	/**
	 * Runs a basic int operation
	 */
	public int basicIntOperation() {
		return (101 + 0) / 3;
	}
	/**
	 * Runs a basic double operation
	 */
	public BigDecimal basicDoubleOperation() {
		return new BigDecimal(3.0e-6 * 10000000.1);
	}
	/**
	 * Runs returning true and true
	 */
	public boolean trueAndTrue() {
		return true && true;
	}
	/**
	 * Runs returning false or (true and true)
	 */
	public boolean falseAndTrueAndTrue() {
		return false || (true && true);
	}
	/**
	 * Runs returning false or false
	 */
	public boolean falseOrFalse() {
		return (false || false);
	}
	/**
	 * Runs converting fahrenheit to celsius
	 */
	public BigDecimal fahrenheitToCelsius(BigDecimal fahrenheit) {
		return new BigDecimal(( 5 *(fahrenheit.doubleValue() - 32.0)) / 9.0);	
	}
	/**
	 * Runs converting inches to meters
	 */
	public BigDecimal inchesToMeters(BigDecimal inches) {
		return (new BigDecimal(inches.doubleValue()).multiply(new BigDecimal(0.0254d)));
	}
	/**
	 * Runs reading an integer between 0 and 1000 
	 * and adding all the digits in the integer
	 */
	public int addAllIntegersBetweenZeroAndOneThousand(int integer){
		
		String integerString = Integer.toString(integer);
		char[] charArray = integerString.toCharArray();
		
		int total = 0;
		for(char character: charArray) {
			int characterToInt = Character.getNumericValue(character);
			total = total + characterToInt;			
		}
		
		return total;
	}
	
	/**
	 * Runs converting minutes into number of years and days
	 */
	public Object[] convertMinutesIntoNumberOfYearsAndDays(int minutes){
		
		Object[] yearsAndDays = new Object[2];
		
		final double MINUTES_IN_YEAR = 60 * 24 * 365;
		Long years = Long.valueOf((long) (minutes / MINUTES_IN_YEAR));
        Integer days = Integer.valueOf((int) (minutes / 60 / 24) % 365);
		
        yearsAndDays[0] = years;
        yearsAndDays[1] = days;
        
        return yearsAndDays;
	}
	/**
	 * Runs retrieving the current time in GMT
	 */
	public String retrieveTheCurrentTimeInGMT(long timeOffset){
		
		long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;      
        long currentHour = ((totalHours + timeOffset) % 24);
		
		return currentHour + ":" + currentMinute + ":" + currentSecond;
	}
	
	/**
	 * Runs computing body mass index
	 */
	public Double computeBodyMassIndex(double heightInInches, double weightInPounds){
		
		double BMI = weightInPounds * 0.45359237 / (heightInInches * 0.0254 * heightInInches * 0.0254);
		return new Double(BMI);
		
	}
	/**
	 * Runs convert distance and time to speed
	 */
	public Float[] convertDistanceAndTimeToSpeed(float distance, float hr, float min, float sec){
		
		Float[] returnValues = new Float[3];
		float timeSeconds = 0.00f;
		float mps = 0.00f;
		float kph = 0.00f;
		float mph = 0.00f;
		
		timeSeconds = (hr*3600) + (min*60) + sec;
		mps = distance / timeSeconds;
		kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
		mph = kph / 1.609f;
		
		returnValues[0] = mps;
		returnValues[1] = kph;
		returnValues[2] = mph;
		
		return returnValues;
		
	}
	/**
	 * Runs converting To square, cube, and fourth power
	 */
	public Double[] convertToSquareCubeAndFourthPower(double number){
		
		Double[] returnValues = new Double[3];
		
		returnValues[0] = new Double(Math.pow(number, 2));
		returnValues[1] = new Double(Math.pow(number, 3));
		returnValues[2] = new Double(Math.pow(number, 4));
		
		return returnValues;
		
	}	
	/**
	 * Runs converting two integers to the sum, the difference, the product, 
	 * the average, the distance (the difference between integer), 
	 * the maximum (the larger of the two integers), 
	 * and the minimum (smaller of the two integers)
	 * 
	 * This is untested in Junit as running the average is breaking
	 * the machine
	 */
	public Double[] convertToTheDifferenceProductAverageDistanceMaximumAndMinimum(int int1, int int2){
		
		Double[] returnValues = new Double[6];
		
		returnValues[0] = new Double(int1 + int2);
		returnValues[1] = new Double(int1 - int2);
		returnValues[2] = new Double(int1 * int2);
		returnValues[3] = new Double((double) (int1 + int2) / 2);
		
		if(int1 > int2) {
			returnValues[4] = new Double(int1);
		}
		else if (int2 > int1) {
			returnValues[4] = new Double(int2);
		}
		else{returnValues[4] = new Double(int1);}
		
		if(int1 < int2) {
			returnValues[5] = new Double(int1);
		}
		else if (int2 < int1) {
			returnValues[5] = new Double(int2);
		}
		else{returnValues[5] = new Double(int1);}
	
		return returnValues;
		
	}
}
