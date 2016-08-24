package sig.oss;
import static org.junit.Assert.*;
import org.junit.Test;
public class GraderTest {
	@Test
	public void testGradeA() {
		Grade g = Grader.calculate_grade(45,45);
		assertEquals(Grade.A, g);
	}
	public void testGradeB() {
		Grade g = Grader.calculate_grade(45,35);
		assertEquals(Grade.A, g);
	}
	@Test //okggggg
	public void testGradeC() {
		Grade g = Grader.calculate_grade(35,30);
		assertEquals(Grade.C, g);// just test
	}
	}

