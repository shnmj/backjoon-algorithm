import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 좌표값을 그대로 사용하려면 헷갈리지 않게 100대신 101로.
        boolean arr[][] = new boolean[101][101];
        int sum = 0;
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    if(!arr[x+j][y+k]) {
                        arr[x+j][y+k] = true;
                        sum += 1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}