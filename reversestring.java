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



// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter String:");
//         String str = sc.nextLine();

//         int end = str.length();

//         for(int i = str.length() - 1; i >= 0; i--) {

//             if(str.charAt(i) == ' ') {

//                 System.out.print(str.substring(i + 1, end) + " ");

//                 end = i;
//             }
//         }

//         System.out.print(str.substring(0, end));

//         sc.close();
//     }
// }