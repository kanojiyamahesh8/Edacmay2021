import java.util.Scanner;
class A1_7
{
  public static void main(String args[])
   {
   System.out.println("Program to find the first ten integral multiples of a number"); System.out.println("");
   
   
   System.out.println("Enter the number: ");
   Scanner mk=new Scanner(System.in);
   int num1=mk.nextInt();
   System.out.println("Input number given: "+num1);

   for(int i=1;i<=10;i++)
      {
      int mul=i*num1;
      System.out.println(num1+" x "+i+" = "+mul);
      }

   }
}
      
