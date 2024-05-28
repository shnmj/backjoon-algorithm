import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        String st = sc.nextLine();
        
        for(int i=0; i<str.length; i++) { // 배열 크기만큼 반복
            if(st.contains(str[i]))  
   // st문자열에 있는지 검사 ex:"c="이 st문자열에 있으면 true가 return되어 if문 안으로.
                st = st.replace(str[i], "!");
        }
        System.out.println(st.length());
    }
}