import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char charArr[][] = new char[5][15];
        
        for(int i=0; i<5; i++) {
            String tmp = sc.nextLine();
            
            for(int j=0; j<tmp.length(); j++) {
                charArr[i][j] = tmp.charAt(j);
            }
        }
                
        for(int j=0; j<15; j++) {
            for(int i=0; i<5; i++) {
                // 5줄 입력받고 배열의 값이 null이 아니면 행부터 증가하면서 출력.
                // char 변수는 null 체크를 0으로 함
                if(charArr[i][j] !=0) {
                    System.out.print(charArr[i][j]);
                }
            }
        }
    }
}