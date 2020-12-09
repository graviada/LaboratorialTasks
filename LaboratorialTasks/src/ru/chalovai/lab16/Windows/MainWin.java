package ru.chalovai.lab16.Windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWin extends JFrame {
    private JPanel panel;
    private JMenuBar menuBar;
    private JTextArea textArea;
    private JTextField email,root;
    private JButton enter;
    private JLabel label;

    public MainWin(){
        super("Система заказов");
        setSize(450,500);
        this.panel=new JPanel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создание текстовых полей
        email = new JTextField(15);
        email.setText("Почта");
        enter =new JButton("Вход");
        label = new JLabel("Авторизация : ");

        root = new JTextField(15);
        root.setText("Пользователь");
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email_= email.getText();
                String root_= root.getText();
                if(root_.equals("admin")){
                    AdminWin adminWin = new AdminWin();
                    adminWin.setVisible(true);

                }else if(root_.equals("Пользователь")){
                    UserWin userWin = new UserWin();
                    userWin.setVisible(true);
                }
            }
        });

        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(label);
        contents.add(email);

        contents.add(root);
        contents.add(enter);

        setContentPane(contents);
        setSize(500, 90);
        setVisible(true);

    }
}
