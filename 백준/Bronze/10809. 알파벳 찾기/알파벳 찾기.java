import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int check[] = new int[26];
        
        for(int i=0; i<check.length; i++) {
            check[i] = -1;
        }
        String st = sc.next();
        for(int i=0; i<st.length(); i++) {
            char c  = st.charAt(i);
            int tmp = (int)c;
            tmp    -= 97;
            if(check[tmp] == -1)
                check[tmp] = i;
        }
        for(int i=0; i<check.length; i++)
            System.out.print(check[i] + " ");
    }
}