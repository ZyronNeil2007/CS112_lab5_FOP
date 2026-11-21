package love_exercise_no5;
import java.util.Scanner;
public class love_exercise_no5_2 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num;
		System.out.println("Enter Number: ");
		num = numero.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("even ");
			}else {
				System.out.println("odd ");
			}
		}
		
		
		
		
		
	}

}
