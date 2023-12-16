import java.util.*;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author HP
 */
public class RPS {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int ch, num, i=0, j=0;
        System.out.println("\t\t\tRock/Paper/Scissor\n\t\t\t Lets play");
        do{
        System.out.println("\n1. Rock\n2. Paper\n3. Scissor\n4. Know Score\n5. Game exit()");
        System.out.print("enter your choice");
        ch=sc.nextInt();
        if(ch>=6)
        {
            System.out.println("invalid ! Restart again");
            System.exit(0);
        }
         
        /*Random r=new Random();
        System.out.print("computer choice is : ");
        num=r.nextInt(3)+1;
        System.out.print(num+"\n");*/
        
        switch(ch)
        {
            case 1 :Random x=new Random();
                    System.out.print("computer choice is : ");
                    num=x.nextInt(3)+1;
                    System.out.print(num+"\n");

            if(num==1)
            {
                System.out.println("____Draw");
            }
            else if(num==2)
            {
                System.out.println("____Computer win");
                j++;
            }
            else 
            {
                System.out.println("____You win");
                i++;
            }         
            break;
            
            case 2 :Random y=new Random();
                    System.out.print("computer choice is : ");
                    num=y.nextInt(3)+1;
                    System.out.print(num+"\n"); 
               
            if(num==1)
            {
                System.out.println("____you win");
                i++;
            }
            else if(num==2)
            {
                System.out.println("____Draw");
            }
            else 
            {
                System.out.println("____Computer win");
                j++;
            }
            break;
            
            case 3 :Random z=new Random();
                    System.out.print("computer choice is : ");
                    num=z.nextInt(3)+1;
                    System.out.print(num+"\n"); 
                 
            if(num==1)
            {
                System.out.println("____Computer win");
                j++;
            }
            else if(num==2)
            {
                System.out.println("____You win");
                i++;
            }
            else 
                System.out.println("____Draw");
             
             break;
             
            case 4 : if(i==j)
             {
                 System.out.println("Both have same score");
             }
             else if(i>j)
             {
                 System.out.println("You lead by "+(i-j)+"points");
             }
             else
                 System.out.println("Computer lead by "+(j-i)+"points");
               
             break;
             
             case 5 : System.exit(0);
             
             break;
        }
          
    }while(true);
    }
}
