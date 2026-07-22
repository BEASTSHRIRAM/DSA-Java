package samplecode;

public class EmployeeManagement {
    int id;
    String name;
    int salary;

    public EmployeeManagement(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void diplayInfo(){
        System.out.println("Employee details are "+name+ salary);
    }
    void increaseSalary(double percentage){
        if(percentage>0&&percentage<=100) {
            int increase = (int) (salary * (percentage / 100));
            salary += increase;
            System.out.println("New salary is :" + salary);
        }else {
            System.out.println("Please enter the value above 0 and below 100");
        }
    }

    public static void main(String[] args) {
        EmployeeManagement employeeManagement=new EmployeeManagement(1,"sriram",12550);
        employeeManagement.diplayInfo();
        employeeManagement.increaseSalary(7.5);
    }
}
