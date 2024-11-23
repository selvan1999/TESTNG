package Scanner.com;
import java.util.Scanner;

public class Task{
	
	void addition() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your name");
	String name = scan.next();
			
	System.out.println("Student name is: "+name);
	
	System.out.println("Enter your subj 1");
	int val1=scan.nextInt();
	if (val1>35) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
		}
	
	System.out.println("Enter your subj 2");
	int val2=scan.nextInt();
	if (val1>35) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
		}
	
	System.out.println("Enter your subj 3");
	int val3=scan.nextInt();
	if (val1>35) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
		}
	
	System.out.println("Enter your subj 4");
	int val4=scan.nextInt();
	if (val1>35) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
		}
	
	System.out.println("Enter your subj 5");
	int val5=scan.nextInt();
	if (val1>35) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
		}
			
	int sum = (val1+val2+val3+val4+val5); 
		System.out.println("Total: "+sum);
	
	float i = (float)sum/500;
	float j = (float)i*100;

	
		System.out.println("Percentage: "+j);
		
	}

	public static void main(String[] args) {
		Task call = new Task();
		call.addition();
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
