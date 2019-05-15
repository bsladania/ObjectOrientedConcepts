/*
 * overriding means to override the functionality of an existing method.
 * Rule||||||||
 * Method name and signature should be identical in super and sub class.
 * 
 */

public class OverridingAndOverloading
{
  public static void main(String[] args)
  {
    Dog d = new Dog();
    d.move();
    d.A_Move();
    d.A_Move("I am overloaded method!");
  }
}

class Animal
{
  public void move()
  {
    System.out.println("Animals can move!!");
  }
}

class Dog extends Animal
{
  public void move()
  {
    System.out.println("Dogs can move!!");
  }
  public void A_Move(){
    super.move();
  }
  //If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
  //Method overloading is not possible by changing the return type of the method only because of ambiguity.
  public void A_Move(String s){
    System.out.println(s);
  }
    
}