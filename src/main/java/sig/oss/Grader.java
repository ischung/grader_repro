package sig.oss;
//Initial Grader Project
public class Grader { 
final static int MAX_SCORE = 50;
	static public Grade calculate_grade(int mid, int fin) {
		int tot;
		Grade grade=Grade.F;
		if(check_score(mid) && calculate_grade(fin)){
			tot = mid+fin;
			if (tot>=80) grade=Grade.A;
			else if (tot>=70)grade=Grade.B;
			else if (tot>=60)grade=Grade.C;
			else grade=Grade.F;
		}
		return grade;
	}
	
	static boolean check_score(int score){
		if (score >= 0 && score <= MAX_SCORE) return true;
		else throw new InvalidInputException();
	}
}

