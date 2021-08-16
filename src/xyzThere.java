import java.util.Scanner;

public class xyzThere {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        if(str.length()>=3 && str.substring(0,3).equals("xyz")){
            System.out.println("true for xyz");
        }
        for(int i=0;i<str.length()-2;i++){
            if(str.substring(i,i+3).equals("xyz") && str.charAt(i-1)!='.'){
                System.out.println("True for xyz");
            }
        }
        System.out.println("false");
    }
}
