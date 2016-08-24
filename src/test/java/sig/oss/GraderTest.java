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
	public void testGradeA() {
		Grade g = Grader.calculate_grade(35,45);
	        assertEquals(Grade.B, g):
	
	} //just test
}
