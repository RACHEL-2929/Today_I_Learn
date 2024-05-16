package main.java.com.ohgiraffers.question;

public class User {
    // 회원의 id, pwd, name 을 받을 DTO
    private String id;
    private String pwd;
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getInfo() {
        return "User{ id = "+ id + ", pwd = "+pwd + ", name = "+name+ "}";
    }
}
