public class Employee1 {

    String empId;
    String empName;
    int empSalary;

    Employee1(String empId,String empName){
        this.empId = empId;
        this.empName = empName;


        System.out.println();
        System.out.println("Employee id is    :"+empId);
        System.out.println("Employee name is  :"+empName);
        
        

    }

    Employee1(String empId,String empName,int empSalary){

        this( empId , empName);
        this.empSalary = empSalary;
       
        System.out.println("Employee salary is  :"+empSalary);
        System.out.println();
       

    }

    public static void main(String[] args) {
        Employee1 e1 = new Employee1("A001" , "manish");
        Employee1 e2 = new Employee1("B001" , "parul" , 100000);
        Employee1 e3 = new Employee1("A991" , "jack");
        Employee1 e4 = new Employee1("c001" , "arun" , 200000);

        
    }
}
