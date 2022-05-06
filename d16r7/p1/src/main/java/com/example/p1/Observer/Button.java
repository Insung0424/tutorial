package com.example.p1.Observer;

public class Button {
    //관찰자패턴: 변화발생시 미리등록된 다른클래스에 통보해줌 ex)이벤트전달
    private String name;
    private IButtonListener buttonListener;

    public Button(String name){
        this.name = name;
    }

    public void click(String message){
        buttonListener.clickEvent(message);
    }

    public void addListener(IButtonListener buttonListener){
        this.buttonListener = buttonListener;
    }
}
