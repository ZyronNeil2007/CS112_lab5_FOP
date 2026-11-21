
package love_exercise_no5;

import java.util.Scanner;

public class love_exercise_no5_B {

    public static void main(String[] args) {

        Scanner myProg5_b = new Scanner(System.in);

        int grade;
        double transmutedGrade;

        System.out.print("Enter your Grade: ");
        grade = myProg5_b.nextInt();

        switch (grade) {
            case 100, 99, 98:
                transmutedGrade = 1.0;
                break;

            case 97, 96, 95:
                transmutedGrade = 1.25;
                break;

            case 94, 93, 92:
                transmutedGrade = 1.50;
                break;

            case 91, 90, 89:
                transmutedGrade = 1.75;
                break;

            case 88, 87, 86:
                transmutedGrade = 2.0;
                break;

            case 85, 84, 83:
                transmutedGrade = 2.25;
                break;

            case 82, 81, 80:
                transmutedGrade = 2.50;
                break;

            case 79, 78, 77:
                transmutedGrade = 2.75;
                break;

            case 76, 75:
                transmutedGrade = 3.0;
                break;

            default:
                transmutedGrade = 5.0;
                break;
        }

        if (grade >= 0 && grade <= 100) {
            System.out.println("Your Transmuted Grade is: " + transmutedGrade);
        } else {
            System.out.println("Invalid grade! Please enter 0-100.");
        }

    }
}
