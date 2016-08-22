package sig.oss;
import static org.junit.Assert.*;
import org.junit.Test;

public class GraderTest {

	@Test
	public void testGradeA() {
		Grade g = Grader.calculate_grade(45,45);
		assertEquals(Grade.A, g);

	}
	@Test
	public void testGradeB() {
		Grade g = Grader.calculate_grade(35,35);
		assertEquals(Grade.B, g);

	}
	@Test
	public void testGradeC() {
		Grade g = Grader.calculate_grade(30,35);
		assertEquals(Grade.C, g);

	}
	@Test
	public void testGradeF() {
		Grade g = Grader.calculate_grade(25,25);
		assertEquals(Grade.F, g);

	}
	@Test
	public void testGradeF1() {
		Grade g = Grader.calculate_grade(0,0);
		assertEquals(Grade.F, g);

	}

}