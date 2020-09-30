
public class Assignment2 {

	public static void main(String[] args) {

		double grade1= 91.14; 
		double grade2= 85.01;
		double grade3= 72;
		double grade4= 63;
		double grade5= 81.14;
		double grade_avg;
		grade_avg = (grade1 + grade2 + grade3 + grade4 + grade5)/5;
		
		char G;
		if (grade_avg>=90.00 && grade_avg<100.00) {
			G = 'A';
		}
		else if(grade_avg>=80.00 && grade_avg<90.00){
			G = 'B';
		}
		else if(grade_avg>=70.00 && grade_avg<80.00){
			G = 'C';
		}
		else {
			G = 'F';
		}
		

		switch (G) {
			case 'A':
				System.out.println("A: Fantastic job!");
			case 'B':
				System.out.println("B: Good!");				
			case 'C':
				System.out.println("C: Please try more next time!");
			break;
		}


	}

}
