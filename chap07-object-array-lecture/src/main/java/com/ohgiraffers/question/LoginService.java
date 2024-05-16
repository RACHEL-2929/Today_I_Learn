package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class LoginService {
    //    * - 회원 가입, 로그인 메소드 연결
    Scanner sc = new Scanner(System.in);

    public void signUp() {
        System.out.println("가입할 아이디를 적어주세요 : ");
        String id = sc.next();

        System.out.println("가입할 이름을 적어주세요 : ");
        String name = sc.next();

        System.out.println("가입할 비밀번호를 적어주세요 : ");
        String pwd = sc.next();

        System.out.println("다시 한 번 비밀번호를 적어주세요 : ");
        String pwdEquals = sc.next();

        //비밀번호와 비밀번호 확인이 일치하면 객체 생성 후 repo에 등록하러 가기
        if (pwd.equals(pwdEquals)) {
            User user = new User(id, pwd, name);
            LoginRepository loginRepository = new LoginRepository();
            if (loginRepository.registUser(user)) System.out.println("회원 가입 성공!");
            else {
                System.out.println("회원 가입 실패 ㅠㅠ");
            }
        } else {
            System.out.println("확인 비밀번호와 일치하지 않습니다.");
        }
    }


    public void login() {
        LoginRepository loginRepository = new LoginRepository();
        if (!loginRepository.checkUsers()) {
            System.out.println("가입한 회원이 없습니다!!");
        }else{
            System.out.println("아이디를 적어주세요: ");
            String id = sc.next();

            System.out.println("비밀번호를 적어주세요: ");
            String pwd = sc.next();

            User user = new User(id, pwd);

            System.out.println("로그인 시도 중");
            if (loginRepository.loginUser(user)) {
                System.out.println("로그인 성공");
                System.exit(0);
            } else {
                System.out.println("로그인 실패");
            }
        }
    }

    public void find() {
        LoginRepository loginRepository = new LoginRepository();
        loginRepository.finder();
    }
}
