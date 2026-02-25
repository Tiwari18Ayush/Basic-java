// Question 3: Student Record System
// Design a Java class Student with:
// •	Private variable: marks
// •	Default (package-private) variable: name
// •	Public variable: rollNumber
// Include:
// •	Getter and setter methods for marks
// •	A method displayDetails() to show student information
// Create another class School in the same package to:
// •	Access and modify name directly
// •	Access marks only through getter/setter
// •	Print student details
class Student{
    private int marks;
    String name;
    public int rollNumber;
    void setMarks(int marks){
        this.marks=marks;
    }
    int getMarks(){
        return this.marks;
    }
    void displayDetails(){
        System.out.printf("Name: %s, Roll Number: %d, Marks: %d%n", this.name, this.rollNumber, this.marks);
    }
}
public class Record{
    public static void main(String[] args){
        Student s=new Student();
        s.name="Alice";
        s.rollNumber=101;
        s.setMarks(85);
        s.displayDetails();
    }
}
