package main.java.com.ohgiraffers.understand.service;

import main.java.com.ohgiraffers.understand.auth.googleAuth;
import main.java.com.ohgiraffers.understand.auth.kakaoAuth;
import main.java.com.ohgiraffers.understand.auth.naverAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class MemberService{
    /*MemberDTO 클래스를 매개변수로
    받고 기존에 있는 사용자와 같은 값을 갖는지 확인한다.
    login() / signUp() 구현*/

    public void login(MemberDTO memberDTO) {

        if(memberDTO.getNo() == 1){
            //google
            googleAuth googleAuth = new googleAuth();
            if(googleAuth.login(memberDTO)) System.out.println(googleAuth+"에 인증된 "+ memberDTO.getId()+"님 환영합니다.");
            else System.out.println(googleAuth+"에 인증된 회원이 없습니다.");

        } else if (memberDTO.getNo() ==2) {
            //kakao
            kakaoAuth kakaoAuth = new kakaoAuth();
            if(kakaoAuth.login(memberDTO)) System.out.println(kakaoAuth+"에 인증된 "+ memberDTO.getId()+"님 환영합니다.");
            else System.out.println(kakaoAuth+"에 인증된 회원이 없습니다.");

        }else if (memberDTO.getNo()==3){
            //naver
            naverAuth naverAuth = new naverAuth();
            if(naverAuth.login(memberDTO)) System.out.println(naverAuth+"에 인증된 "+ memberDTO.getId()+"님 환영합니다.");
            else System.out.println(naverAuth+"에 인증된 회원이 없습니다.");

        }else System.out.println("잘못 입력하셨습니다.");
    }

    public void signUp(MemberDTO memberDTO){
        if(memberDTO.getNo() == 1){
            googleAuth googleAuth = new googleAuth();
            googleAuth.signUp(memberDTO);
        }
        else if (memberDTO.getNo()==2){
            kakaoAuth kakaoAuth = new kakaoAuth();
            kakaoAuth.signUp(memberDTO);
        } else if (memberDTO.getNo()==3) {
            naverAuth naverAuth = new naverAuth();
            naverAuth.signUp(memberDTO);

        } else System.out.println("잘못 입력하셨습니다.");
    }
}
