package com.example.withapi.Controller;

public class welcome {

    private String name;
    private String pw;

   /* public welcome(String name,String pw) {
        this.name = name;
        this.pw = pw;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "welcome{" +
                "name='" + name + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
