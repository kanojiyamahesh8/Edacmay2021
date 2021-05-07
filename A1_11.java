import java.util.Scanner;
class A1_11
{	
  
  public static void main(String args[])
    {
    System.out.println();
    System.out.println("Program to evaluate Area and perimeter of a circle"); System.out.println("");
    System.out.println("Enter the radius of circle");

    Scanner mk=new Scanner(System.in);
    float radius=mk.nextFloat();
    float pi=3.14F;
    double perimeter=2*pi*radius;
    double area=pi*radius*radius;
    //double area=3.14*radius*radius
    System.out.println("perimeter="+perimeter);
    System.out.println("area="+area);
    area=3.14D*radius*radius;
    System.out.println("area="+area);
    
    }
}

