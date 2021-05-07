import java.util.Scanner;
class A1_6
{
	public static void main(String args[])
	{
        System.out.println("program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.");
      
        System.out.println("Enter the two numbers : ");
   
        Scanner mk=new Scanner(System.in);
        int num1=mk.nextInt();
        int num2=mk.nextInt();
        System.out.println("Numbers entered by user:"+num1+" and "+num2);  

        int i;
        i=num1+num2 ;
	System.out.println(num1+"+"+num2+" = "+i);
        
	i=num1*num2 ;
	System.out.println(num1+"x"+num2+" = "+i);

	i=num1-num2 ;
	System.out.println(num1+"-"+num2+" = "+i);
 
	i=num1/num2 ;
	System.out.println(num1+"/"+num2+" = "+i);

        i=num1%num2 ;
 	System.out.println(num1+" mod "+num2+" = "+i);
	
	}
}
