// public char[] toCharArray()
// 문자열로 입력받음과 동시에 char 배열에 각 단어를 담어서 쓰는 법
// 문자열 길이가 가변적으로 입력받으며 하나씩 참조해야할 때 유용한 메소드

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();
        
        char[] b = B.toCharArray();
        
        System.out.println(A * (b[2]-'0'));
        System.out.println(A * (b[1]-'0'));
        System.out.println(A * (b[0]-'0'));
        System.out.println(A * Integer.parseInt(B));
        
    }
}