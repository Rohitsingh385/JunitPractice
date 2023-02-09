import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GraderTest {

	@Test
	void test() {
		Grader grader = new Grader();
		assertEquals('F',grader.NumberGrade(59));
	}
	
	@Test
	void test2() {
		Grader grader = new Grader();
		assertEquals('D',grader.NumberGrade(64));
	}
	
	@Test
	void test3() {
		Grader grader = new Grader();
		assertEquals('B',grader.NumberGrade(82));
	}
	
	@Test
	void test4() {
		Grader grader = new Grader();
		assertEquals('A',grader.NumberGrade(95));
	}
	
	@Test
	void test5() {
		Grader grader = new Grader();
		assertThrows(IllegalArgumentException.class,
				() -> {
					grader.NumberGrade(-1);
				});
	}

}
