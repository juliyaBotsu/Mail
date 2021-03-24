package com.devcolibri;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static Sender tlsSender = new Sender("yourself.sup@gmail.com", "yuliya201410");
    public static String emmail;
    public static void createGUI()
    {
        JFrame frame = new JFrame("Test frame");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTextArea emma = new JTextArea();
        JButton button = new JButton("Push");

        button.setBounds(30,110,100,20);
        //frame.setPreferredSize(new Dimension(200, 100));
        emma.setBounds(30,80,200,20);
        emmail = emma.getText();
        frame.add(emma);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                emmail = emma.getText();
                System.out.println(Main.emmail);
                for (int i =0;i<50;i++){
                tlsSender.send("Some ", "🖤🖤🖤🖤🖤🖤🖤!", "support@devcolibri.com", Main.emmail);
            }
            }
        });

    }
    public static void main(String[] args){

        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });

    }
}
