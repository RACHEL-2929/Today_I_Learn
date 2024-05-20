package main.java.com.ohgiraffers.understand.auth;

import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class kakaoAuth implements SnsAuth {
    private static int i;
    private static MemberDTO[] memberDTOS = new MemberDTO[10];

    @Override
    public boolean login(MemberDTO memberDTO) {

        for (int j = 0; j < i; j++) {
            if ((memberDTOS[j].getId().equals(memberDTO.getId()))
                    && memberDTOS[j].getPwd().equals(memberDTO.getPwd())) {
                return true;
            }
        }
        System.out.println("아직 등록된 회원이 없습니다.");
        return false;

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
        return "kakaoAuth";
    }
}
