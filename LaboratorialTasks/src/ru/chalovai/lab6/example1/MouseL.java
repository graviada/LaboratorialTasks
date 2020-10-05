package ru.chalovai.lab6.example1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseL implements MouseListener {
    private Label loginField;

    public void mouseClicked(MouseEvent event) {
        if (loginField.getText().equals("Иван"))
            JOptionPane.showMessageDialog(null, "Вход выполнен");
        else
            JOptionPane.showMessageDialog(null, "Вход НЕ выполнен");
    }
    public void mouseEntered(MouseEvent event) {}
    public void mouseExited(MouseEvent event) {}
    public void mousePressed(MouseEvent event) {}
    public void mouseReleased(MouseEvent event) {}
}
