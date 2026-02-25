// Question 1: Student Grade Calculator
// •	Uses a class and object
// •	Takes marks for multiple subjects using a loop
// •	Uses conditional statements to assign grades
import java.util.Scanner;
class Calculator{
    Character grade;
    String subject;
    void assignGrade(int score){
       if(score>=90 && score<=100){
        this.grade='A';
       }
       else if(score>=80 && score<90){
        this.grade='B';
       }
       else if(score>=70 && score<80){
        this.grade='C';
       }
       else if(score>=60 && score<70){
        this.grade='D';
       }
       else{
        this.grade='F';
       }
    }
    void displayGrade(){
        System.out.printf("Grade Obtained in %s: %s%n", this.subject, this.grade);
    }
}
public class GradeCalculator{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks for 3 subjects:");
        Calculator c=new Calculator();
        for(int i=0;i<3;i++){
            int marks=s.nextInt();
            c.assignGrade(marks);
            c.displayGrade();
        }
        
    }
}