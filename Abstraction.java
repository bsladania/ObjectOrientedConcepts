/*
 * Abstraction: It is a process of hiding the implementation details from the user, only the functionality will be provided to the user.
 * Rules|||||||||||||||||||||||||||||
 * A class which contains the abstract keyword in its declaration is known as abstract class.
 * Abstract classes may or may not contain abstract methods, i.e., methods without body
 * But, if a class has at least one abstract method, then the class must be declared abstract.
 * If a class is declared abstract, it cannot be instantiated.
 * To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
 * If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
 */ 

public class Abstraction
{
  public static void main(String[] args)
  {
    Employee s = new Salary("Bunty","Web Developer",40);
    
    System.out.println(s.pay());
    s.display();
  }
}

abstract class Employee
{
  private String name;
  private String title;
  private double hours;
  
  public Employee(String name, String title, double hours)
  {
    this.name = name;
    this.title = title;
    this.hours = hours;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  public void setTitle(String title)
  {
    this.title = title;
  }
  public void setHours(double hours)
  {
    this.hours = hours;
  }
  
  public String getName()
  {
    return name;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public double getHours()
  {
    return hours;
  }
  
  public abstract double pay();
  
  public void display()
  {
    System.out.println(name + " - " + title);
  }
  
}

class Salary extends Employee
{
  public Salary(String name, String title, double hours)
  {
    super(name, title, hours);
  }
  
  public double pay()
  {
    return super.getHours() * 15;
  }
}