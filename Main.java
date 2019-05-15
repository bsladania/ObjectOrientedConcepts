/*
 * Simple I/O program.
 */
import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    String name;
    int age;
    double height;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter you name");
    try{
      name = sc.nextLine();
      System.out.println("Please Enter you Age in digits");
      age = sc.nextInt();
      System.out.println("Please Enter you height in digits");
      height = sc.nextDouble();
      System.out.format("Your name is %s. You are %d years old and you are %.2f foot long.", name,age,height);
    }
    catch(Exception ex){
      System.out.println("Invalid input. Please use numbers for age and height.");
    }
    
   
  }
}