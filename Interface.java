/* Interface: It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
 * Rules||||||||||||||||||
 * You cannot instantiate an interface.
 * An interface does not contain any constructors.
 * All of the methods in an interface are abstract.
 * An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
 * An interface is not extended by a class; it is implemented by a class.
 * An interface can extend multiple interfaces.
 */

public class Interface
{
  public static void main(String[] args)
  {
    Husky h = new Husky();
    h.eat();
    h.travel();
    h.Bark();
  }
}

interface Animal
{
  public void eat();
  public void travel();
}
interface Dog extends Animal
{
 public void Bark(); 
}

class Husky implements Dog
{
 public void eat()
 {
   System.out.println("Husky loves to eat cookies.");
 }
 
 public void travel()
 {
   System.out.println("Husky does travel in the owner's Jeep.");
 }
 
 public void Bark()
 {
   System.out.println("Bao! Baoo!");
 }
}