package ir.aut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("test");
        jFrame.setSize(500, 500);
        jFrame.setLayout(new GridLayout(3, 1));
        JLabel jLabel = new JLabel();
        try {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String str = new String(s.getBytes(), "UTF-8");
            jLabel.setText(str);
        } catch (UnsupportedEncodingException e) {
            System.out.println("something went wrong");
        }

        JTextField jTextField = new JTextField();
        jTextField.setEnabled(true);
        jFrame.add(jTextField);
        JButton send = new JButton("send");
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == send){
                    try {
                        String st = new String(jTextField.getText().getBytes(), "UTF-8");
                        System.out.println(st);
                    }catch (UnsupportedEncodingException err){
                        System.out.println("wrong");
                    }
                }
            }
        });
        jFrame.add(send);
        jFrame.add(jLabel);
        jFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        jFrame.setVisible(true);


    }
}
