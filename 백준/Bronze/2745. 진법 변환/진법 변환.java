import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String N = st.nextToken(); // N = B진법
        int B = Integer.parseInt(st.nextToken()); // 몇 진법인지,,
        br.close();
        
        int tmp = 1; // 각 문자마다 해당 자리 수 B만큼 곱
        int sum = 0; // 마지막 출력 숫자
        
        for(int i  = N.length()-1; i>=0; i--) {
            char C = N.charAt(i); 
            
            if('A'<=C && C<='Z') {
                sum += (C - 'A' + 10) * tmp;
            } else {
                sum += (C - '0') * tmp;
            }
            tmp *= B; // 각 자리 수를 B로 곱하여 다음 자리로 넘김
        }
        
        System.out.println(sum);
    }
}
        
        
        