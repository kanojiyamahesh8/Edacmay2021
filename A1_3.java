import java.util.Scanner;
class A1_3
{
  public static void main(String args[])
   {
   System.out.println("Program to find divison of two numbers"); System.out.println("");

   System.out.println("Enter the two numbers you want to divide: Note[first number entered should be numerator]:");
   
   Scanner mk=new Scanner(System.in);
   int num1=mk.nextInt();
   int num2=mk.nextInt();
   System.out.println("Numbers entered by user:"+num1+" and "+num2);
   int divison_result=num1/num2;
   System.out.println("divison_result="+divison_result);
   }
}
