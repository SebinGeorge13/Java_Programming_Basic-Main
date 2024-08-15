/*   Write a java program which creates a class named employee and have following member name, date, phone number, address, salary .
It also has a method to print salary which prints the salary which prints the salary of employee.
2 classes offices and manager have data members specialization and department.
Now assign name , age, Phone number, address and salary to an officer and a manager .
by making an object of both of this classes and print the same.*/

class Employee{
    int id;
    String name;
    String dob;
    double phonnum;
    String address;
    double salary;
  
    void printsalary(){
        System.out.println(name+" "+salary);
    }
}
class officer extends Employee{
    String department;
    String specialization;
    
    void printall(){
        System.out.println("\nID : "+id+"\nName : "+ name+"\nDOB : "+dob+"\nPhone Number : "+phonnum+"\nAddress : "+address+"\nSalary : "+salary+"\nSpecialization : "+specialization+"\nDepartment : "+department);
    }
    
}
class manager extends Employee{
    String department;
    String specialization; 
    
    void printall(){
        System.out.println("\nID : "+id+"\nName : "+ name+"\nDOB : "+dob+"\nPhone Number : "+phonnum+"\nAddress : "+address+"\nSalary : "+salary+"\nSpecialization : "+specialization+"\nDepartment : "+department);
    }  
}

class Inheritance_Example_Employee{
    public static void main(String []args){
        officer o = new officer();
        o.id = 369;
        o.name="Paul";
        o.dob = "18.04.2002";
        o.phonnum = 200;
        o.salary = 43344;
        o.address = "India";
        o.specialization = "Machine Learning";
        o.department = "Computer Science";
        o.printsalary();
        
        o.printall();
        
        manager b = new manager();
        b.id = 555;
        b.name="Thomas";
        b.dob = "26.05.2002";
        b.phonnum = 300;
        b.salary = 55344;
        b.address = "Australia";
        b.specialization = "Block Chain";
        b.department = "Computer Science";
        b.printsalary();
        
        b.printall();
    }
}
