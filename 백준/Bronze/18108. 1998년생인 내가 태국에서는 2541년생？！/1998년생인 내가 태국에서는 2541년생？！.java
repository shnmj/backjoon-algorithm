// 서기와 불기 차이 = 543년 (2541 - 1998)
// 불기가 주어졌을 때 주어진 불기에 543년을 빼준 값 = 서기

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int year   = in.nextInt();
        
        System.out.println(year - 543);
    }
}