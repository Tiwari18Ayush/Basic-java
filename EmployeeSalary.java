// Question 4: Employee Salary Management System
// Create a Java class Employee with the following requirements:
// 1.	Data Members:
// o	empId (int)
// o	empName (String)
// o	salary (double)
// 2.	Constructors:
// o	A default constructor that initializes values to:
// 	empId = 0
// 	empName = "Not Assigned"
// 	salary = 0.0
// o	A parameterized constructor to initialize employee details using user input.
// 3.	Methods:
// o	A method displayDetails() to print employee information.
// 4.	In the main class:
// o	Create one object using the default constructor.
// o	Create multiple objects using the parameterized constructor inside a loop (for example, for 3 employees).
// o	Display details of all employees.
class Employee{
    int empId;
    String empName;
    double salary;
    Employee(){
        this.empId=0;
          this.empName="Not Assigned";
           this.salary=0.0; 
    }
    Employee(int id,String name,double sal ){
          this.empId=id;
          this.empName=name;
          this.salary=sal;
    }

}