package com.jspstudio.ex83retrofit2;

public class Item {

    // 이 멤버변수의 이름들은 반드시 json문자열의 식별자와 일치해야 함 [ 대소문자까지 안맞으면 인식못함 ]
    int no;
    String title;
    String msg;

    public Item(int no, String title, String msg) {
        this.no = no;
        this.title = title;
        this.msg = msg;
    }

    public Item() {
    }
}
