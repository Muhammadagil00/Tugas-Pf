import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //your code goes here
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = 0; 
        for (int c = 1;c <= a;c++){
        b += c ;
        }
        System.out.println(b);
        
    }

}