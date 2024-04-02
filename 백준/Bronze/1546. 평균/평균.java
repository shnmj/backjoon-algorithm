import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ar[] = new double[n];
        
        int max = 0;
        double sum = 0, maxScore;
        for(int i=0; i<ar.length; i++) {
            ar[i] = sc.nextInt();
            if(ar[max] < ar[i])
                max = i;
        }
        
        maxScore = ar[max];
        for(int i=0; i<ar.length; i++) {
            ar[i] = ar[i]/maxScore*100;
            sum += ar[i];
        }
        System.out.println(sum/n);
    }
}