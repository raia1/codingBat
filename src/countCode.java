import java.util.Scanner;

public class countCode {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str= sc.nextLine();
        int count=0;
        for(int i=0;i<str.length()-3;i=i+1){
            if (str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e'){
                count= count+1;
            }
        }
        System.out.println(count);
    }
}
