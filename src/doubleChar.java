import java.util.Scanner;

public class doubleChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str= sc.next();
        String result="";
        for(int i=0;i<str.length();i++){
            result=result+str.charAt(i)+str.charAt(i);
        }
        System.out.println(result);
    }
}
