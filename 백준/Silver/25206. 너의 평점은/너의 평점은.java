import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double gradeSum = 0; // 학점 합
        double scoreSum = 0; // 점수 합
        
        for(int i=0; i<20; i++) {
            String str = sc.nextLine();
            
            String[] splitStr = str.split(" "); // 공백 기준 split으로 자름
            
            char score = splitStr[2].charAt(0); // charAt(0)으로 우선 앞글자만 따서 점수 입력
            
            double tmp;
            switch (score) {
                case 'A':
                    tmp = 4;
                    break;
                case 'B':
                    tmp = 3;
                    break;
                case 'C':
                    tmp = 2;
                    break;
                case 'D':
                    tmp = 1;
                    break;
                case 'F':
                    tmp = 0;
                    break;
                default: // P는 default로 들어가서 continue
                    continue;
            }
            gradeSum += Double.parseDouble(splitStr[1]);
            if(splitStr[2].length() == 2) {
                if(splitStr[2].charAt(1) == '+') {
                    tmp += 0.5;
                }
            }
            scoreSum += Double.parseDouble(splitStr[1]) * tmp;
        }
        System.out.println(scoreSum/gradeSum);
    }
}
