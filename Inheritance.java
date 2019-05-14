/*
 * Inheritance: Classes can be derived from classes. Basically, if you need to create a new class and here is already a class that has some of the code you require, then it is possible to derive your new class from the already existing code. This concept allows you to reuse the fields and methods of the existing class without having to rewrite the code in a new class. 
 * Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
 * Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
 * Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.
 * 
 */

/*
 * Single Inheritance: Subclasses inherit the features of one superclass.
 */

import java.util.*;
import java.lang.*;
import java.io.*;


public class Inheritance
{
  public static void main(String[] args)
  {
    Child c = new Child();
    c.display();
    c.print_class_name();
    Parent p = new Parent();
    p.print_class_name();
  }
}

class Parent
{
  public void print_class_name()
  {
    System.out.println("This is from parent class.");
  }
}

class Child extends Parent
{
  @Override
  public void print_class_name()
  {
    System.out.println("This is from child class.");
  }
  public void display()
  {
    System.out.println("Message from child class.");
  }
}