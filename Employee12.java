class Address
{
    String city;
    String state;
    int pin_code;
    Address(String city, String state,int pin_code)
    {
        this.city = city;
        this.state = state;
        this.pin_code = pin_code;
    }

}

public class Employee12 {

    int emp_id;
    String emp_name;
    Address address; 


    Employee12(int emp_id ,String emp_name,Address address)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.address = address;

    }

    void displayEmployeeDetail()
    {
        System.out.println(emp_id+" "+emp_name);
        System.out.println(address.city+" "+address.state+" "+address.pin_code);
    }

    public static void main(String[] args) {
        Address a1 =  new Address("Rohini","new delhi",110089);
        Address a2 =  new Address("pitampur","new delhi",110098);

        Employee12 e1 = new Employee12(1,"amit",a1);
        Employee12 e2 = new Employee12(2,"ajay",a2);

        e1.displayEmployeeDetail();
        e2.displayEmployeeDetail();

    }
    
}
