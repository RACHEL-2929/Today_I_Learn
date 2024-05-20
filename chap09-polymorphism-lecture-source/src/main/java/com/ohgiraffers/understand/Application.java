package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.dto.MemberDTO;
import main.java.com.ohgiraffers.understand.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-----Sns 인증으로 로그인 하는 프로그램----");
            System.out.println("1. 인증하기");
            System.out.println("2. 가입하기");
            System.out.println("9. 프로그램 종료");
            int choice = sc.nextInt();

            if(choice == 1 ){
                System.out.println("인증방식을 선택해주세요");
                System.out.println("1. googleAuth");
                System.out.println("2. kakaoAuth");
                System.out.println("3. naverAuth");
                int no = sc.nextInt();
                sc.nextLine();
                System.out.println("아이디를 입력해주세요 : ");
                String id = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요 : ");
                String pwd = sc.nextLine();

                MemberDTO memberDTO = new MemberDTO(id,pwd);
                memberDTO.setNo(no);
                MemberService memberService = new MemberService();
                memberService.login(memberDTO);
            } else if (choice ==2) {
                System.out.println("인증할 sns 방식을 선택해주세요");
                System.out.println("1. googleAuth");
                System.out.println("2. kakaoAuth");
                System.out.println("3. naverAuth");
                int no = sc.nextInt();
                sc.nextLine();
                System.out.println("가입할 아이디를 입력해주세요 : ");
                String id = sc.nextLine();
                System.out.println("가입할 비밀번호를 입력해주세요 : ");
                String pwd = sc.nextLine();

                MemberDTO memberDTO = new MemberDTO(id, pwd);
                memberDTO.setNo(no);
                MemberService memberService = new MemberService();
                memberService.signUp(memberDTO);

            }else return;
        }



    }
}
