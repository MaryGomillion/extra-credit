import java.util.*;
public class ExtraCredit {
    public static void main(String args[]){
        int tc = 0;
        int arr[] = {1,2,3};
        Scanner in = new Scanner(System.in);
        for(int elem : arr)
        {
            System.out.println("round "+ elem + " out of 3");
            int a = (int) (Math.random() * (10 - 1) + 1);
            int b = (int) (Math.random() * (10 - 1) + 1);
            int c = (int) (Math.random() * (10 - 1) + 1);
            System.out.println("the product of all three numbers is: " + (a*b*c));
            System.out.println("the sum of all three numbers is: " + (a+b+c));
            System.out.println("what are your 3 guesses (separate by spaces please): ");
            int d = in.nextInt();
            int e = in.nextInt();
            int f = in.nextInt();
            if(ExtraCredit.check(a,b,c,d,e,f)){
                tc++;
            }
        } 
        ExtraCredit.ending(tc);
        in.close();
    }

     public static boolean check(int a , int b, int c, int x , int y , int z){
        int p = a * b * c, s = a + b + c;
        if((p == x * y * z) && (s == x + y + z)){
            System.out.println("congrats on solving it");
            return true;
        }
        else{
            System.out.printf("the correct numbers were %d, %d, %d \n", a , b, c);
            System.out.println("you'll get it next time!");
            return false;
        }
    }
    public static void ending(int tc){
        System.out.println("you got " + tc + " / 3 correct");
        switch (tc){
            case 0:
            System.out.println("try harder next time");
            break;
            case 1:
            System.out.println("nice try");
            break;
            case 2:
            System.out.println("great job");
            break;
            case 3:
            System.out.println("perfect");
            break;
        }
    }
    }
