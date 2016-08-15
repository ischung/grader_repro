package sig.oss;
//Initial Grader Project
class Grader { 
	static public Grade calculate_grade(int mid, int fin) {
		int tot;
		Grade grade=Grade.F;
		tot = mid+fin;
		if (tot>=80) grade=Grade.A;
		else if (tot>=70)grade=Grade.B;
		else if (tot>=60)grade=Grade.C;
		else grade=Grade.F;
		return grade;
	}
}

