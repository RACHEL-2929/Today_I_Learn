package main.java.com.ohgiraffers.understand.dto;

public class MemberDTO {
    //사용자가 로그인을 하기 위한 정보를 담는다.

    private String id;
    private String pwd;
    int no;

    public MemberDTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", no=" + no +
                '}';
    }
}
