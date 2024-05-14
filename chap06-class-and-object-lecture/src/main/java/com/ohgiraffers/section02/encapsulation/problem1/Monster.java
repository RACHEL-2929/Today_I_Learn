package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    String name;
    int hp;


    //this는 매개변수로 받은 변수와 메소드 밖에서 선언된 전역 변수의 이름과 똑같을 때
    // 어떤 변수를 뜻하는 지 모르니까 this를 사용해서 this.변수는 전역 변수를 뜻한다.


    public void setHp(int hp) {
        if(hp > 0) {
            System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
            this.hp = hp;
        }
        else {
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 설정합니다.");
            this.hp = 0;
        }
    }

}
