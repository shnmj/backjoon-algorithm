import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // 테스트 케이스 수
        int[] c = new int[t]; // 거스름돈 배열 선언
        
        for(int i = 0; i < t; i++) {
            c[i] = sc.nextInt(); // 각 테스트 케이스에 대한 거스름돈 입력
        }
        
        int[] coin = {25, 10, 5, 1}; // 동전 단위를 배열로 선언
        
        for(int i = 0; i < t; i++) { // 테스트 케이스 수만큼 반복
            int[] res = new int[4]; // 결과 저장 배열, 0으로 초기화
            
            for(int j = 0; j < coin.length; j++) { // 각 동전 단위에 대해 반복
                res[j] = c[i] / coin[j]; // 해당 동전으로 줄 수 있는 최대 개수 계산
                c[i] %= coin[j]; // 나머지 거스름돈 업데이트
            }
            
            for(int j = 0; j < res.length; j++) {
                System.out.print(res[j]);
                if (j < res.length - 1) {
                    System.out.print(" "); // 각 동전 개수 사이에 공백 추가
                }
            }
            System.out.println(); // 한 테스트 케이스의 결과 출력 후 줄 바꿈
        }
        
        sc.close(); // Scanner 객체 닫기
    }
}
