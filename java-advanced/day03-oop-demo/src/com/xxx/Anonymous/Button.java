package com.xxx.Anonymous;

import javax.swing.*;

public class Button {
    public static void main(String[] args) {
        JFrame win = new JFrame("Login");
        JButton btn = new JButton("Login");
        // test
        win.add(btn);

        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

    }
}
