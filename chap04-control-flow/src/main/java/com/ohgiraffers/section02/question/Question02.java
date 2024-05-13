package main.java.com.ohgiraffers.section02.question;

import java.util.Scanner;

public class Question02 {
    /*
 입력한 숫자 범위 내에서 소수를 찾아 출력하는 프로그램을 작성 해봅시다
 사용자로부터 시작 숫자와 끝 숫자를 입력 받습니다. 프로그램은 해당 범위 내에 존재하는 모든 소수를 출력합니다.
 소수 = 1과 자기 자신을 제외한 수로 나누어 떨어지지 않는 수
 (약수가 1과 자기자신 뿐인것)
  */
    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작 숫자를 입력해주세요 : ");
        int start = sc.nextInt();
        System.out.println("끝 숫자를 입력해주세요 : ");
        int end = sc.nextInt();
        int cnt = 0;
//        (약수가 1과 자기자신 뿐인것)
        for (int i = start; i <= end; i++) {
            cnt = 0;
            for (int j = 2; j <= i; j++) {
                //약수의 개수가 1개면
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.println(i + "는 소수");
            }

        }

    }
}
