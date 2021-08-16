import java.util.Scanner;

public class bobThere {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str= sc.nextLine();
        for(int i=0;i<str.length()-2;i++){
            String temp=str.substring(i,i+3);
                if (temp.charAt(0) == 'b' && temp.charAt(2) == 'b') {
                    System.out.println("bob present");
                }
        }

    }
}

