import java.util.Scanner;
class A1_8
{	
  
  public static void main(String args[])
    {
    System.out.println();
    System.out.println("BIG JAVA Matrixprogram"); System.out.println("");
    
    System.out.println("Enter the number of rows and colomnns minimum 4x22:");
    Scanner mk=new Scanner(System.in);
    int rows=mk.nextInt();
    System.out.println("Number of rows entered:"+rows);
    System.out.println("Enter the number of coloumns");
    int coloumns=mk.nextInt();
    System.out.println("Number of coloumns entered:"+coloumns); 

    System.out.println("");
    System.out.println("This is your matrix of size:"+rows+"X"+coloumns);
    System.out.println("");
    
   
    for(int i=1;i<=rows;i++)
    {

    for(int j=1;j<=coloumns;j++)  
    {

    if( (i==1 && j==4) || (i==2 && j==4) || (i==3 && j==1) || (i==3 && j==4) || (i==4 && j==3)  || (i==4 && j==2) )   
    System.out.print("J");  //printing J
    else 
    if( (i==1 && j==9) || (i==2 && j==8) || (i==2 && j==10) || (i==3 && j==7) || (i==3 && j==8) || (i==3 && j==9) || (i==3 && j==10) ||       (i==3  && j==11) || (i==4 && j==6) || (i==4 && j==12) ) 
     System.out.print("A");  //printing A
    else
    if( (i==1 && j==11) || (i==1 && j==17) || (i==2 && j==12) || (i==2 && j==16) || (i==3 && j==13) || (i==3 && j==15) ||  (i==4 && j==14) )
     System.out.print("V"); //printing V                               
    else
    if( (i==1 && j==19) || (i==2 && j==18) || (i==2 && j==20) || (i==3 && j==17) || (i==3 && j==18) || (i==3 && j==19) || (i==3 && j==20) ||   (i==3  && j==21) || (i==4 && j==16) || (i==4 && j==22) )  
    System.out.print("A");  //printing A
    else
    System.out.print(" ");  //printing space elsewhere

     }
    
    System.out.println();
    }

    System.out.println("");
    }
    

    
}
