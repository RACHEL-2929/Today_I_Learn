package main.java.com.ohgiraffers.understand.auth;

import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public interface SnsAuth {
    /*login() 을 제공한다.
    여유가 있는 수강생은 signUp()까지*/

    public boolean login(MemberDTO memberDTO);
    public void signUp(MemberDTO memberDTO);

}
