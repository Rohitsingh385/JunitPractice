import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	@Test
	void test() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(4,calculator.add(2,2));
	}
	@Test
	void test_2() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(10,calculator.add(7,3));
	}


}
