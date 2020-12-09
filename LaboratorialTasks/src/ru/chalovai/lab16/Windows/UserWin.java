package ru.chalovai.lab16.Windows;

import ru.chalovai.lab16.Dish;
import ru.chalovai.lab16.Drink;
import ru.chalovai.lab16.DrinkTypeEnum;
import ru.chalovai.lab16.InternetOrder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class UserWin extends JFrame {
    private JPanel panel;
    private JMenuBar menuBar;
    private JTextArea textArea;
    private InternetOrder internetOrder;

    public UserWin(){
        super("Кабинет пользователя");
        internetOrder = new InternetOrder();

        setSize(700,200);
        this.panel=new JPanel();
        this.menuBar= new JMenuBar();
        this.textArea= new JTextArea(1,1);
        textArea.setFont(new Font("TimesRoman", Font.ITALIC,23));
        textArea.setBackground(Color.white);

        JMenu drink = new JMenu("Добавить напиток");
        JMenu dish = new JMenu("Добавить блюдо");
        JMenu do_ = new JMenu("Оформить заказ");

        add(textArea);

        JMenuItem don = new JMenuItem("Приступить к оформлению заказа");

        JMenuItem juice = new JMenuItem("Сок");
        JMenuItem champaign = new JMenuItem("Шампанское");
        JMenuItem wine = new JMenuItem("Вино");

        JMenuItem roast = new JMenuItem("Ростбиф");
        JMenuItem chicken = new JMenuItem("Курица");
        JMenuItem potatoes = new JMenuItem("Картошка");

        don.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EndWin endWin = new EndWin(internetOrder);
                endWin.setVisible(true);
            }
        });

        juice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Drink drink1 = null;
                try {
                    drink1 = new Drink("Сок","яблочный",80, DrinkTypeEnum.Juice);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                internetOrder.add(drink1);
                textArea.setText("Сок " + drink1.getDescription() + " добавлен в заказ, стоимость " + drink1.getPrice());
            }
        });

        champaign.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Drink drink1= null;
                try {
                    drink1 = new Drink("Шампанское","новогоднее",200, DrinkTypeEnum.Champaign);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                internetOrder.add(drink1);
                textArea.setText("Шампанское " + drink1.getDescription() +" добавлено в заказ, стоимость " + drink1.getPrice());
            }
        });

        wine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Drink drink1= null;
                try {
                    drink1 = new Drink("Вино","красное",350, DrinkTypeEnum.Wine);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                internetOrder.add(drink1);
                textArea.setText("Вино " + drink1.getDescription() +" добавлено в заказ, стоимость " + drink1.getPrice());
            }
        });

        roast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dish dish1= null;
                try {
                    dish1 = new Dish("Ростбиф","говядина",180);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                internetOrder.add(dish1);
                textArea.setText("Ростбиф (" + dish1.getDescription() + ") добавлен в заказ, стоимость " + dish1.getPrice());
            }
        });

        chicken.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dish dish1= null;
                try {
                    dish1 = new Dish("Курица","Цыпленок табака",200);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                internetOrder.add(dish1);
                textArea.setText("Курица (" + dish1.getDescription() + ") добавлена в заказ, стоимость " + dish1.getPrice());
            }
        });

        potatoes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dish dish1= null;
                try {
                    dish1 = new Dish("Картошка","жареная",80);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                internetOrder.add(dish1);
                textArea.setText("Картошка " + dish1.getDescription() + " добавлена в заказ, стоимость " + dish1.getPrice());
            }
        });

        JMenuItem menu_postClient = new JMenuItem("Добавить клиента");
        menu_postClient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        drink.setMnemonic(KeyEvent.VK_C);
        dish.setMnemonic(KeyEvent.VK_C);
        do_.setMnemonic(KeyEvent.VK_C);

        drink.add(juice);
        drink.add(champaign);
        drink.add(wine);
        dish.add(roast);
        dish.add(chicken);
        dish.add(potatoes);
        do_.add(don);

        menuBar.add(drink);
        menuBar.add(dish);
        menuBar.add(do_);

        setJMenuBar(menuBar);
    }
}
