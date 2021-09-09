package com.company.backup;

import com.company.CheckBox;
import com.company.TextBox;
import com.company.UIControl;

public class MainPolymorphism {

    public static void main(String[] args) {
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());

    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }

}
