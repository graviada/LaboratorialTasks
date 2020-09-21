package ru.chalovai.lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class ShowPicture extends JFrame
{
    JTextField textField = new JTextField(65);
    JButton btn = new JButton("Show");

    String filePath = "";
    public ShowPicture()
    {
        super("ShowPicture");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel pic = new JLabel();
        JPanel pnl = new JPanel();

        btn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    filePath = textField.getText();
                    ImageIcon myIcon = new ImageIcon(filePath);
                    pic.setIcon(myIcon);
                }
                catch (Exception e) {
                    throw new IllegalArgumentException("Картинка не найдена!");
                    //JOptionPane.showMessageDialog(null, "Картинка не найдена!",
                            //"INFO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        JOptionPane.showMessageDialog(this, "Введите адрес картинки",
                "INFO", JOptionPane.INFORMATION_MESSAGE);

        pnl.add(textField);
        pnl.add(pic);
        pnl.add(btn);
        add(pnl);

        setSize(700,500);
    }

    public static void main (String []args) throws Exception {
        new ShowPicture().setVisible(true);
    }
}

//C:\Users\Пользователь\Downloads\original.jpg