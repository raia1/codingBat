import java.util.Scanner;

public class repeatEnd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str= sc.nextLine();
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        String lastN=str.substring(str.length()-n);
        String total="";
        for(int i=0;i<=n;i++){
            total+=lastN;
        }
        System.out.println(total);
    }
}
