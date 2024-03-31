import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        
        int max  = 0;
        int ar[] = new int[n];
        for(int i=0; i<n; i++) {
            ar[i] = sc.nextInt();
            
            if(ar[max] < ar[i])
                max = i;
        }
        System.out.println(ar[max] + "\n" + (max+1));
    }
}