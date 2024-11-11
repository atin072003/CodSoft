import java.util.*;
import java.lang.Math;
public class Numbergame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        do{
        int max = 100;
        int min = 1;
        int range = max-min +1;
        int rand = (int)(Math.random() * range) + min;
        System.out.println("Please enter an integer between 1 to 100");
        int num = sc.nextInt();
        if(num==rand){
                System.out.println("You guessed the right number");
        }
        else if(num<rand){
                System.out.println("Your guess is too low");
            }
        else{
            System.out.println("Your guess is too high");
        }
        System.out.println("Do you want to play more Y/N");
        Scanner str = new Scanner(System.in);
        String ch=str.nextLine();
        char cha=(ch.charAt(0));
        if(cha=='Y'){
            continue;
        }
        else{
            break;
        }
        }while(flag);

    }
}