package com.xxx.d2_Computer;

public class Run {

    public static void main(String[] args) {
        Computer computer = new Computer();
        USB u1 = new Mouse("LogicMouse");
        USB u2 = new KeyBoard("LogicKeyBoard");
        computer.installUSB(u1);
        computer.installUSB(u2);
    }

}
