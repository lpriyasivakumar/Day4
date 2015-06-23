import static org.junit.Assert.*;
import org.junit.Test;


public class FactorialCalculatorTest {

	@Test
	public void testGetFactorial() {
		long answer = 6;
		int number = 3;
		FactorialCalculator fc = new FactorialCalculator();
		assertEquals(answer,FactorialCalculator.getFactorial(number));
	}

	@Test
	public void testGetFactorialWithRecursion() {
		long answer = 362880;
		int number = 9;
		FactorialCalculator fc = new FactorialCalculator();
		assertEquals(answer,fc.getFactorialWithRecursion(number));
	}

}
