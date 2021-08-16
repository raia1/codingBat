import java.util.Locale;
import java.util.Scanner;

public class endOther {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String: ");
        String a= sc.nextLine();
        String b= sc.nextLine();
        if (a.length()<b.length()){
            a=b.toLowerCase(Locale.ROOT);
            b=a.toLowerCase(Locale.ROOT);
        }
        System.out.println(a.substring(a.length()-b.length()).equals(b));
    }
}
