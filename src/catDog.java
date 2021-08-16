import java.util.Scanner;

public class catDog {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
    String str = sc.nextLine();
//        System.out.println(str);
        System.out.println(str.length());
    int count = 0;
    int count2=0;
        for (int i = 0; i <str.length()-2; i=i+1) {    //str.length-(reading frame-1)-->3-1
//            String temp = str.substring(i, i + 2);
          if (str.substring(i,i+3).equals("cat") ) {
            count=count+1;
          }
          if (str.substring(i,i+3).equals("dog") ) {
                count2=count2+1;
          }
        }
        System.out.println(count==count2);
    }
}


