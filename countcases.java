import java.util.Scanner;
public class countcases{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter You string");
        String Str = sc.nextLine();

        int lower = 0;
        int upper = 0;

        for(int i=0;i<Str.length();i++){
            char ch = Str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upper++;
            }
            if(ch >= 'a' && ch <= 'z'){
                lower++;
            }
        }
          System.out.println("UPPERCASE: " + upper);
        System.out.println("LOWERCASE: " + lower);
        sc.close();
    }
}