package main.java.com.ohgiraffers.understand.auth;

import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class naverAuth implements SnsAuth {

    private static int i;
    private static MemberDTO[] memberDTOS = new MemberDTO[10];

    @Override
    public boolean login(MemberDTO memberDTO) {

        for (int i = 0; i < memberDTOS.length; i++) {
            if(((memberDTOS[i].getId()).equals(memberDTO.getId()))
                    && (memberDTOS[i].getPwd()).equals(memberDTO.getPwd())) return true;
            else {System.out.println("아직 등록된 회원이 없습니다."); return false;}
        }return false;


    }

    @Override
    public void signUp(MemberDTO memberDTO) {
        System.out.println(memberDTO);
        if (i < 10) {
            memberDTOS[i] = memberDTO;
            i++;
        } else System.out.println("정원초과");
    }

    @Override
    public String toString() {
        return "naverAuth";
    }
}
