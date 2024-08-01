package com.xxx.d2_Computer;

public class Computer {
    public void installUSB(USB u){
        u.connect();

        if (u instanceof Mouse){
            Mouse mouse = (Mouse) u;
            mouse.click(5);
        }

        if (u instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) u;
            keyBoard.check(5);
        }
        u.disconnect();
    }
}
