/*
 * Multilevel Inheritance : a derived class will be inheriting a base class and as well as the derived class also act as the base class to other class.
 */

import java.util.*;
import java.io.*;

public class MultiLevelInheritance
{
  public static void main(String[] args)
  {
    //-----------
    A a = new A();
    B b = new B();
    C c = new C();
    //-----------
    A b1 = new B();
    A c1 = new C();
    A c2 = new C();
    
    a.print_class_name();
    b.print_class_name();
    c.print_class_name();
    
    b1.print_class_name();
    c1.print_class_name();
    c2.print_class_name();
    
  }
}

class A
{
  public void print_class_name()
  {
    System.out.println("This is from class A.");
  }
}

class B extends A
{
  public void print_class_name()
  {
    System.out.println("This is from class B.");
  }
}

class C extends B
{
  public void print_class_name()
  {
    System.out.println("This is from class C.");
  }
}


