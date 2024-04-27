import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String S = in.nextLine();
        in.close();
        
        // st에 공백 기준으로 나눈 토큰들을 st에 저장
        StringTokenizer st = new StringTokenizer(S, " ");
        
        // countTokens() 토큰 개수 반환
        System.out.println(st.countTokens());
    }
}