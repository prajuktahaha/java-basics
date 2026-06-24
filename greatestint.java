//take 3 positive integer input and print greatest
import java.util.Scanner;
public class greatestint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a>c){
            System.out.println("a is is the greatest intenger");
        }
        else if(b > a && b > c){
            System.out.println("b is the greatest integer");
        }
        else{
            System.out.println("c is greatest integer");
        }
    }
}
