package com.t3h.main;

import com.t3h.quadratic.GUI;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setVisible(true);

        com.t3h.stdmnger.GUI guistd = new com.t3h.stdmnger.GUI();
        guistd.setVisible(true);

        com.t3h.login.GUI guiLogin = new com.t3h.login.GUI();
        guiLogin.setVisible(true);
    }
}
