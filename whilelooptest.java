package whilelooptest;
import java.util.Scanner;
public class WhileLoopTest {

public static void main(String[] args)
{

//    
//                    //<Test>
//    int ct=1,sum=0,grade=0;
//Scanner x = new Scanner(System.in);
//while (ct<=4){
//System.out.println("Enter Grade  for Sudent"+ct);
// grade = x.nextInt();
//sum+=grade;
//ct++;
//}
//        System.out.println("AVREAGE\t"+sum/4);
    
         
                        /* <Test-2>
             
        int count=1,sum=0,grade=0;
Scanner x = new Scanner(System.in);
System.out.println("Enter 5 grade to get avrage or -1 to Exit");
while (count<=5&&grade!=-1){
System.out.println("Enter Grade  for Sudent"+count);
 grade = x.nextInt();
sum+=grade;
count++;
}
     System.out.println(sum/6); 
     */
     /*
                //<Test-3>
    
      
    int count=1,sum=0,grade=0;
    Scanner x = new Scanner(System.in);
    System.out.println("Enter 6 grade to get avrage");
    do 
    {
    System.out.println("Enter Grade  for Sudent"+count);
    grade = x.nextInt();
    sum+=grade;
    count++;
    }
    while (count<=5);
    System.out.println(""+sum/6);
    */ 
    
                    //<&>Test<&>
       Scanner x = new Scanner(System.in);
    int option,X1,X2 ;
    
     
        do
    {
        System.out.println("#\n");
        System.out.println("Choices from the menu");
        System.out.println("1.SUM TO NUMBER");
        System.out.println("2.SUBTRACT 2 NUMBER");
        System.out.println("3.DIVIDE  ");
        System.out.println("0.Exit");
        option = x.nextInt();
        switch(option)
       
                {
            case 1 : 
                System.out.println("ENTER FIRST NUMBER");
                X1 = x.nextInt();
                System.out.println("ENTER SECOUND NUMBER");
                X2 = x.nextInt();
                    System.out.println("Sum two number :"+(X1+X2));
                 break;
            case 2 :
                System.out.println("ENTER FIRST NUMBER");
                X1 = x.nextInt();
                System.out.println("ENTER SECOUND NUMBER");
                X2 = x.nextInt();
                   ;System.out.println((X1-X2)+"\nSUBTRACT 2 NUMBER\n");
                 break;
            case 3 :
                System.out.println("ENTER FIRST NUMBER");
                X1 = x.nextInt();
                System.out.println("ENTER SECOUND NUMBER");
                X2 = x.nextInt();
                    System.out.println((X1/X2)+"\nDIVIDE  \n");
                 break;
            case 0 :
                    System.out.println("^^Good bye^^");
                 break;
            default:
                    System.out.println("<invild option>\n");
                 break;
        }
    }
    while(option!=0);

        
        //<TEST>
        
//    int Test=0 , grade=0 , sum=0;
//Scanner input = new Scanner(System.in);
//while(Test<=4)
//{
//System.out.println("Enter your grade number"+Test);
//grade = input.nextInt();
//sum+=grade;
//Test++;
//
//}
//System.out.println("The sum of all"+sum/5);

//    Scanner rader = new Scanner(System.in);
//    double sum =0.0;
//            double COUNTER;
//              boolean PostiveIn=true;
//                while(PostiveIn==true){
//                    System.out.println("Enter positve number");
//                     COUNTER=rader.nextDouble();
//                     
//                        if (COUNTER<=0)
//                              PostiveIn=false;
//                            else
//                             sum=sum+COUNTER;
//                        
//                }
//    System.out.println(" SUM "+sum);
    
//<<TEST>>

//    Scanner LUCKY = new Scanner(System.in);
//    int rand, guess;
//        rand = (int)(Math.random()*10);
//          boolean Stillplaying=true;
//          while(Stillplaying){
//       System.out.println("Guess number");
//            guess = LUCKY.nextInt();
//          
//                 if(guess>rand){
//                    System.out.println("too big\t"+rand);
//                 rand = (int)(Math.random()*10);}
//                 else if
//                          (guess<rand){
//                       System.out.println("too small\t"+rand);
//                     rand = (int)(Math.random()*10);
//                 }
//                else
//                     {
//               System.out.println("You win\t"+rand);
//              Stillplaying=false;
//                     }
//          
//        
//    
//    
//    
//    }
    
}
}
 
