import java.util.*;
public class greetings{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Press 1 for English, 2 for Japanese, 3 for French, 4 for Spanish, 5 for Italian");
        int button = sc.nextInt();
        switch (button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Konichiwa");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            case 4 : System.out.println("Hola");
            break;
            case 5 : System.out.println("Ciao");
            break;
        }
    }

}
