// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

using System;

class Program
{
    static void Main(string[] args)
    {
        // 입력 받기
        string[] input = Console.ReadLine().Split(' '); // 띄어쓰기 기준으로 자름
        int A = int.Parse(input[0]);
        int B = int.Parse(input[1]);

        // 처리 로직
        Console.WriteLine(A + B);
    }
}
