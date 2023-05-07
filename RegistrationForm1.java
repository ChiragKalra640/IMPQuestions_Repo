// package com.constructor;

public class RegistrationForm1 
{
  String name;
  String email;
  String password;
  long phone_number;
  String gender;
  String language;
  int zip_code;
  String about;

  

  public RegistrationForm1(String name, String email, String password, long phone_number, String gender,
      String language, int zip_code) {
    super();
    this.name = name;
    this.email = email;
    this.password = password;
    this.phone_number = phone_number;
    this.gender = gender;
    this.language = language;
    this.zip_code = zip_code;
    
    System.out.println("Name: "+name);
    System.out.println("Email: "+email);
    System.out.println("Password: "+password);
    System.out.println("Phone Number: "+phone_number);
    System.out.println("Gender: "+gender);
    System.out.println("Language: "+language);
    System.out.println("Zip Code: "+zip_code);
    System.out.println();
  }
  
  



  public RegistrationForm1(String name, String email, String password, long phone_number, String gender,
      String language, int zip_code, String about) {
    super();
    this.name = name;
    this.email = email;
    this.password = password;
    this.phone_number = phone_number;
    this.gender = gender;
    this.language = language;
    this.zip_code = zip_code;
    this.about = about;
    
    System.out.println("Name: "+name);
    System.out.println("Email: "+email);
    System.out.println("Password: "+password);
    System.out.println("Phone Number: "+phone_number);
    System.out.println("Gender: "+gender);
    System.out.println("Language: "+language);
    System.out.println("Zip Code: "+zip_code);
    System.out.println("About   : "+about);
  }


  public RegistrationForm1() {
    super();
    // TODO Auto-generated constructor stub
  }


  public static void main(String[] args) 
  {
    RegistrationForm1 r1 = new RegistrationForm1("Amit","Amit@gmail.com","Hello@123",9354474625l,"Male","English",110043);
    RegistrationForm1 r2 = new RegistrationForm1("Ajay","Ajay@gmail.com","Ajay@123",9354474625l,"Male","English",110043,"Hello Hi I am Java pro Programmer ");
    RegistrationForm1 r3 = new RegistrationForm1();
  }

}
