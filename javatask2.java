
import java.util.Scanner;

public class javatask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**************Student Grade Calculator*****************");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Please Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): \n");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
System.out.println("------------------------------------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        // here is the Assigning grades based on the average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}




// 1. **Run the Program:**
//    - Start the program by running it.

// 2. **Enter Marks:**
//    - It will ask you how many subjects you have; type the number and press Enter.
//    - Then, enter your marks for each subject (out of 100) one by one.

// 3. **Get Your Grade:**
//    - The program will do the math for you.
//    - It calculates your total marks and your average percentage.
//    - It assigns you a grade based on your average percentage.

// 4. **See Your Results:**
//    - The program will display your total marks, average percentage, and your grade.

// 5. **Done!**
//    - That's it here! here done You now know your total marks, average percentage, and your grade.

// It's a quick tool to figure out your grades based on the marks you've received in your subjects.