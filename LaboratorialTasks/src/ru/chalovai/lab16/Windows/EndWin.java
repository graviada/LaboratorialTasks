package ru.chalovai.lab16.Windows;

import ru.chalovai.lab16.InternetOrder;
import ru.chalovai.lab16.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class EndWin extends JFrame {
    private InternetOrder internetOrder;
    private JPanel panel;
    private JMenuBar menuBar;
    private JTextArea textArea;

    public EndWin(final InternetOrder internetOrder){
        super("Оформить заказ");
        this.internetOrder = internetOrder;

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(600,200);
        this.panel=new JPanel();
        this.menuBar= new JMenuBar();
        this.textArea= new JTextArea(1,1);
        textArea.setFont(new Font("TimesRoman",Font.ITALIC,20));
        textArea.setBackground(Color.white);

        JMenu allmenu=new JMenu("Мой заказ ");
        JMenu price = new JMenu("Цена заказа");
        JMenuItem allmenu_ =new JMenuItem("Вывести на экран");
        JMenuItem price_= new JMenuItem("Вывести на экран");

        add(textArea);

        allmenu_.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String context = new String();
                ru.chalovai.lab16.MenuItem menuItem[]=internetOrder.getItems();
                for(MenuItem menuItem1:menuItem){
                    if(menuItem1!=null)
                        context+=menuItem1.toString()+" \n";
                }
                textArea.setText(context);
            }
        });

        price_.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String prize=String.valueOf(internetOrder.priceTotal());
                textArea.setText(prize);
            }
        });

        allmenu.setMnemonic(KeyEvent.VK_C);
        price.setMnemonic(KeyEvent.VK_C);

        allmenu.add(allmenu_);
        price.add(price_);

        menuBar.add(allmenu);
        menuBar.add(price);

        setJMenuBar(menuBar);
    }
}
