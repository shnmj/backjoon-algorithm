import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        sc.close();
        int len    = str.length();
        int ans    = 1;
        
        for(int i=0; i<len/2; i++) {
            
            /* charAt() 사용 시 단어가 서로 일치해야 하므로 
                str.charAt(i)와 str.charAt(len-1-i)가 다른경우
                ans = 0이 되게 설정. */
            
            if(str.charAt(i) != str.charAt(len-1-i)) {
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}