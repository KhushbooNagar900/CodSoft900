import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean addMoreStudents = true;
        while(addMoreStudents)
        {
        final int num_subjects = 5;
        int[] marks = new int[num_subjects];
        float total = 0;
        String grade;
        String studentName;
        float average;
        String[] subjects = {"Mathematics", "Science", "English", "Hindi", "Social-Science"}; //subjects name


        System.out.print("Enter the student's name: "); // Prompt for student's name
        studentName = scanner.nextLine();  //Read student's name
        

        // marks obtained (out of 100) in each subject
        for (int i = 0; i < num_subjects; i++) {
            System.out.print("Enter marks for " + subjects[i]  +": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        System.out.println("\nObtained Marks Out Of 500 / "+total); //Display total marks

        //calculating average here
        average = total / num_subjects;

        // Determine grade based on average
        if (average >= 80) {
            grade = "A";
            
        } else if (average >= 60 && average < 80) {
            grade = "B";
           
        } else if (average >= 40 && average < 60) {
            grade = "C";
        
        } else if(average >=33 && average<40)
        {
            grade = "D";
        }
        else
        {
            grade ="E";
        }

        //Displaying the total marks, average percentage, and the corresponding grade to the user

        System.out.println("\nStudent Report Card");
        System.out.println("--------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Subjects: " + num_subjects);
        System.out.println("Marks:"); // Display marks for each subject


        for (int i = 0; i < num_subjects; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("Total of  all subjects out o 500:" + total);
        
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        //status of result 
        if (average < 33) {
            System.out.println("Status: Fail");
            System.out.println("Remarks: Work harder to achieve better results!");
        }else if(average>=80)
        {
            System.out.println("Status: Pass with Brilliant Performance!");
            System.out.println("Remarks: We wish you a bright future"); 
        } 
        
        else if(average >= 60 && average < 80) 
        {
            System.out.println("Status: Pass with Good Performance!");
            System.out.println("Remarks: We wish you a bright future"); 
        
        }
        else if(average >= 40 && average < 60)
        {
            System.out.println("Status: Pass with Fair Performance!"); 
            System.out.println("Remarks: Keep up the fair work!");
        }else if(average >=33 && average<40)
        {
            System.out.println("Status: Pass with Below Average Performance!");
            System.out.println("Remarks: You need to improve your performance!");
        }
    
        System.out.print("\nDo you want to add more students? (yes/no): ");
        
        String response = scanner.next();
        scanner.nextLine(); 

        if (!response.equalsIgnoreCase("yes")) {
            addMoreStudents = false;
        }

    }
    System.out.println("\nThanks for using Student Grade Calculator!");
    System.out.println("Developed by Khushboo Nagar");
    System.out.println("Version 1.0");
    System.out.println("Copyright 2024 Khushboo Nagar");
    System.out.println("All rights reserved.");

    scanner.close();
} 
  
}




