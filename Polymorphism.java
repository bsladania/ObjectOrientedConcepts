/*
 * Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
 */


public class Polymorphism
{
  public static void main(String[] args)
  {
    //ability of an object to take on many forms
    Deer d = new Deer();
    Animal a = d;
    Vegetarian v = d;
    Object o = d;
    
    d.Specification();
    d.VegEat();
    
    a.Specification();
    //a.VegEat(); method does not exist in Animal Class
    //v.Specification(); abstract method does not exist in Vegetarian interface class 
    v.VegEat();
    
    //o.Specification();
    //o.VegEat();
  }
}
//interface
interface Vegetarian
{
  public void VegEat();
}
//super class
class Animal
{
  public void Specification()
  {
    System.out.println("I am animal.");
  }
}
//sub class
class Deer extends Animal implements Vegetarian
{
  public void VegEat()
  {
    System.out.println("I like to eat plants.");
  }
}