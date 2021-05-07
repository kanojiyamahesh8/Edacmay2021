import java.util.Scanner;
class A1_5
{
  public static void main(String args[])
   {
   System.out.println("Program to find product of two numbers"); System.out.println("");

   System.out.println("Enter the two numbers you want to multiply: ");
   
   Scanner mk=new Scanner(System.in);
   int num1=mk.nextInt();
   int num2=mk.nextInt();
   System.out.println("Numbers entered by user:"+num1+" and "+num2);
   int product_result=num1*num2;
   System.out.println(num1+"x"+num2+" = "+product_result);
   }
}
