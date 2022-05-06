package com.example.p1.Observer;

public interface IButtonListener {
    void clickEvent(String event);
    //관찰자패턴: 변화발생시 미리등록된 다른클래스에 통보해줌 ex)이벤트전달
}
