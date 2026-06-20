import java.util.Scanner;
public class profitloss {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of SP");
        double SP = sc.nextDouble();
        System.out.println("Enter the vaue of CP");
        double CP = sc.nextDouble();
        if(SP > CP){
            System.out.println("its profit of " + (SP-CP));
        }
        else if (SP < CP){
            System.out.println("its loss of " + (CP-SP));
        }
        else{
            System.out.println("see again");
        }
    }
}
