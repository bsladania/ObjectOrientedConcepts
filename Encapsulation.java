/*
 *In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding. 
 */

public class Encapsulation
{
 public static void main(String[] args)
 {
   ABC abc = new ABC();
   abc.setName("Bikramjeet Singh");
   abc.setCity("Cambridge, ON");
   abc.setAge(23);
   
   System.out.println("My name is " + abc.getName() + ".");
   System.out.println("I am from " + abc.getCity() + ".");
   System.out.println("I am " + abc.getAge() + " years old.");
 }
}

class ABC
{
  private String name;
  private String city;
  private int age;
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setCity(String city)
  {
    this.city = city;
  }
  
  public void setAge(int age)
  {
    this.age = age;
  }
  
  public String getName()
  {
    return name;
  }
  
  public String getCity()
  {
    return city;
  }
  
  public int getAge()
  {
    return age;
  }
}