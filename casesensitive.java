import java.util.Scanner;

public class casesensitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String str = sc.nextLine();
        int count=0;
        String Words[]=str.split(" ");
        for(int i = 0;i<Words.length;i++){
            if(Words[i].length()>0){
                char ch = Words[i].charAt(0);
                
                if(ch == 'A' || ch == 'E' || ch == 'I' ||
                   ch == 'O' || ch == 'U' ||
                   ch == 'a' || ch == 'e' || ch == 'i' ||
                   ch == 'o' || ch == 'u') {

                    count++;
                }
            }
        }
         if(count == 0)
            System.out.println("No String found");
        else
            System.out.println(count);
        sc.close();
    }
}
