import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(str.length());
        int count = 0;
        for (int i = 0; i < str.length()-1; i=i+1) {
//            String temp = str.substring(i, i + 2);
            if (str.substring(i,i+2).equals("hi") ) {
                count=count+1;
            }
        }
        System.out.println("Number of Hi or hi: " + count);
    }
}
