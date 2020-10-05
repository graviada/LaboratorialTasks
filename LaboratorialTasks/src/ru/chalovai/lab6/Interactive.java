package ru.chalovai.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interactive extends JFrame {

    JPanel pn = new JPanel();
    JTextField fieldNum = new JTextField();
    JLabel lblResult = new JLabel("Угадайте число от 0 до 20");
    JButton butPlay = new JButton("Угадать");
    int num, try_ = 3, result = 1;

    public Interactive(){
        super("Угадайка");
        setSize(250, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 1, 10, 10));
        pn.setLayout(new GridLayout(2, 1, 5, 5));

        add(fieldNum);
        pn.add(lblResult);
        pn.add(butPlay);
        add(pn);

        num = IntLogic.getNum();

        // Регистрируем слушателя события с помощью addActionListener
        butPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result != 0 && !fieldNum.getText().isEmpty() && try_ > 0) {
                    // parseInt - Анализирует строковый аргумент как знаковое десятичное целое число
                    result = IntLogic.isRight(Integer.parseInt(fieldNum.getText()), num);
                    checkRes(result);
                    try_--;
                }
                if(try_ <= 0 && result != 0){
                    lblResult.setText("Вы проиграли! Я загадал число " + num);
                    // Отключить кнопку
                    butPlay.setEnabled(false);
                }
            }
        });

        setVisible(true);
    }

    public void checkRes(int result){
        if (result == 0){
            lblResult.setText("Вы победили!");
            butPlay.setEnabled(false);
        } else if(result == -1){
            lblResult.setText("Ваше число меньше загаданного");
        } else if(result == 1){
            lblResult.setText("Ваше число больше загаданного");
        }

    }

    public static void main(String[] args) {
        Interactive game = new Interactive();
    }
}