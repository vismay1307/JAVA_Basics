import java.util.Scanner;

public class reversestring {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your String");
        String str = sc.nextLine();

        String Words[]=str.split(" ");


         for(int i = Words.length - 1; i >= 0; i--) {
            System.out.print(Words[i] + " ");
        }

        sc.close();
    }
}