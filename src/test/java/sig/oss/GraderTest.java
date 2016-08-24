package sig.oss;
import static org.junit.Assert.*;
import org.junit.Test;

public class GraderTest {

	@Test
	public void testGradeA() {
		Grade g = Grader.calculate_grade(45,45);
		assertEquals(Grade.A, g);

<<<<<<< HEAD


        @Test
	        public void testGradeB() {
		                Grade g = Grader.calculate_grade(45,35);
				                assertEquals(Grade.A, g);


	}
=======
	} //just test
>>>>>>> master

}
