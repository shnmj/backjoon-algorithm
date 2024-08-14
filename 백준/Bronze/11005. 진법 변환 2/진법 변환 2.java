// 10진수 n과 진법 b를 입력받고 결과를 String으로 출력
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        String result = "";
        
        while(n > 0) {      // n이 0이 될 때까지 반복(입력한 10진수를 b로 계속 나눠서 b진법으로 변환)
            int re = n % b; // n을 b로 나눠 나머지를 맨 오른쪽 자리(1의 자리)부터 수 입력.
            if(re >= 10) {  // 나머지가 10보다 크면 나누는 수b가 11이상. 나머지 10 = A로 바꿈
                result += (char) (re + 55); // A=65
            } else {
                result += re;
            }
            n /= b; // b로 나누고 나머지를 더했으면 이후 또 나눌 수 있는 값이 있는지 확인을 위해 n을 b로 나누고 몫으로 대체.
        }
        for(int i=result.length()-1; i >=0; i--) // result에 맨 앞자리수부터 입력돼서 맨 뒤부터 출력
            System.out.print(result.charAt(i));
    }
}