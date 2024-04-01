import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check[] = new boolean[42];
        int n;
        int cnt = 0;
        
        for(int i=0; i<10; i++) {
            n = sc.nextInt();
            if(!check[n % 42])
                cnt++;
            check[n % 42] = true;
        }
        System.out.println(cnt);
    }
}