package main.java.com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn;
    private int speed;

    //시동이 걸리는 메소드
    public void startUP() {
        if(isOn){//시동이 걸려져 있다면
            System.out.println("이미 시동이 걸려있습니다.");
        }else {//시동이 안 걸려져 있으면
            isOn = true;//시동을 켜고
            System.out.println("시동이 걸렸습니다.");
        }
    }

    //전진하기
    public void go() {
        if(isOn) {//시동이 켜져 있음
            if(speed ==0) {//현재 속도가 0이면
                System.out.println("자동차가 출발합니다.");
            }
            speed += 10;//10씩 증가
            System.out.println("자동차는 시속 " + speed + "km/h 입니다");
        }else {//시동이 꺼져있으면
            System.out.println("자동차는 시동이 걸려야 출발이 가능합니다.");
        }
    }

    //멈추기
    public void stop(){
        if(isOn) {//시동이 걸려 있으면
            if(speed >0) {//현재 속도가 0보다 크면(0이 아니라면)
                while(speed > 0) {//속도를 줄이는 반복문(속도가 0이 되면 반복문 나감)
                    speed--;
                    System.out.println("현재 속도 " + speed + "km/h");//1씩 감소하는 속도
                }
            }
            else {//이미 속도가 0인 상태
                System.out.println("이미 멈춰 있는 상태입니다.");
            }
        }else {//시동이 꺼져있다면
            System.out.println("시동을 걸지 않은 경우 유압으로 인해 브레이크가 점점 무거워 집니다");
        }
    }

    //시동 끄기
    public void turnOff() {
        if(isOn) {//시동이 켜져 있다면
            if(speed>0) {//속도가 0보다 큰 상태면(달리고 있는 중이라면)
                System.out.println("달리는 상태에서 시동을 끄는 것은 위험합니다.");
            }
            else {//속도가 0이라면(멈춘 상태라면)
                isOn = false;
                System.out.println("시동을 끄겠습니다. 고생하셨습니다");
            }
        }else {//시동이 꺼져 있다면
            System.out.println("이미 시동이 꺼져 있습니다");
        }
    }



}
