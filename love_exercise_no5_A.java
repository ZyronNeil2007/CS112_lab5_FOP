package love_exercise_no5;
import java.util.Scanner;

public class love_exercise_no5_A {
	public static void main(String[] args) {
		Scanner myProg5_a = new Scanner(System.in);
		
		String course;
		String name;
		char section;
		
		System.out.print("Enter your Name: ");
		name = myProg5_a.nextLine();
		
		System.out.print("Enter your Course: ");
		course = myProg5_a.nextLine();
		
		
		
		if (course.equals("BSCS")) {
			System.out.println("\nHello " + name+"!\n");
			
			System.out.print("Enter your Section: ");
			section = myProg5_a.next().charAt(0); 
			if(section=='A') {
				System.out.println("You belong to Section: Chrome! ");
			}else if(section=='B') {
				System.out.println("You belong to Section: Safari");
			}else {
				System.out.println("You belong to Section: Firefox");
			}
			
		}else{
			System.out.print(" ");
		}
		

	}

}
