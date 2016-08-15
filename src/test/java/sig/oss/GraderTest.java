package sig.oss;
import static org.junit.Assert.*;
import org.junit.Test;

public class GraderTest {

	@Test
	public void testGradeA() {
		Grade g = Grader.calculate_grade(45,45);
		assertEquals(Grade.A, g);

	}

}