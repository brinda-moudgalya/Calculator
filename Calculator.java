package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private JFrame frame = new JFrame("Calculator");
    private JTextArea txtScreen = new JTextArea();

    // calculation variables
    String string1 = "";
    String string2 = "";
    String [] statement;
    int num1 = 0;
    int num2 = 0;
    String stringTotal = "";
    int totalValue = 0;

    private JButton button0 = new JButton("0");
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");

    private JButton buttonAdd = new JButton("+");
    private JButton buttonSub = new JButton("-");
    private JButton buttonMul = new JButton("*");
    private JButton buttonDiv = new JButton("/");

    private JButton buttonEqual = new JButton("=");
    private JButton ac = new JButton("AC");

    private JButton buttonPlaceholder = new JButton(" ");


    public Calculator(){

        // setting attributes of txtScreen
        txtScreen.setSize(380, 100);
        txtScreen.setLocation(7, 5);
        txtScreen.setEditable(false);
        txtScreen.setFont(new Font("Calibri", Font.PLAIN, 30));

        // 0 button:
        button0.setSize(100, 50);
        button0.setLocation(140, 460);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("0");
            }
        });
        // 1 button:
        button1.setSize(100, 50);
        button1.setLocation(20, 400);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("1");
            }
        });
        // 2 button:
        button2.setSize(100, 50);
        button2.setLocation(140, 400);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("2");
            }
        });
        // 3 button:
        button3.setSize(100, 50);
        button3.setLocation(260, 400);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("3");
            }
        });
        // 4 button:
        button4.setSize(100, 50);
        button4.setLocation(20, 340);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("4");
            }
        });
        // 5 button:
        button5.setSize(100, 50);
        button5.setLocation(140, 340);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("5");
            }
        });
        // 6 button:
        button6.setSize(100, 50);
        button6.setLocation(260, 340);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("6");
            }
        });
        // 7 button:
        button7.setSize(100, 50);
        button7.setLocation(20, 280);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("7");
            }
        });
        // 8 button:
        button8.setSize(100, 50);
        button8.setLocation(140, 280);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("8");
            }
        });
        // 9 button:
        button9.setSize(100, 50);
        button9.setLocation(260, 280);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append("9");
            }
        });

        // add button:
        buttonAdd.setSize(50, 50);
        buttonAdd.setLocation(20, 220);
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append(" + ");
            }
        });
        // sub button:
        buttonSub.setSize(50, 50);
        buttonSub.setLocation(90, 220);
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append(" - ");
            }
        });
        // mul button:
        buttonMul.setSize(50, 50);
        buttonMul.setLocation(160, 220);
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append(" * ");
            }
        });
        // div button:
        buttonDiv.setSize(50, 50);
        buttonDiv.setLocation(230, 220);
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.append(" / ");
            }
        });

        // equals button:
        buttonEqual.setSize(330, 50);
        buttonEqual.setLocation(25, 150);
        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtScreen.getText().contains("+")){
                    statement = txtScreen.getText().split(" \\+ ");

                    string1 = statement[0];
                    string2 = statement[1];

                    num1 = Integer.parseInt(string1);
                    num2 = Integer.parseInt(string2);

                    totalValue = num1 + num2;
                    txtScreen.setText(Integer.toString(totalValue));
                }
                if (txtScreen.getText().contains("-")){
                    statement = txtScreen.getText().split("\\ - ");

                    string1 = statement[0];
                    string2 = statement[1];

                    num1 = Integer.parseInt(string1);
                    num2 = Integer.parseInt(string2);

                    totalValue = num1 - num2;
                    txtScreen.setText(Integer.toString(totalValue));
                }
                if (txtScreen.getText().contains("*")){
                    statement = txtScreen.getText().split("\\ * ");
                    string1 = statement[0];
                    string2 = statement[2];

                    num1 = Integer.parseInt(string1);
                    num2 = Integer.parseInt(string2);

                    totalValue = num1 * num2;
                    txtScreen.setText(Integer.toString(totalValue));
                }
                if (txtScreen.getText().contains("/")){
                    statement = txtScreen.getText().split("\\ / ");

                    string1 = statement[0];
                    string2 = statement[1];

                    num1 = Integer.parseInt(string1);
                    num2 = Integer.parseInt(string2);

                    totalValue = num1 / num2;
                    txtScreen.setText(Integer.toString(totalValue));
                }
            }
        });
        // AC button:
        ac.setSize(60, 50);
        ac.setLocation(300, 220);
        ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen.setText("");
            }
        });

        // adding objects to screen
        frame.add(txtScreen);
        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonAdd);
        frame.add(buttonSub);
        frame.add(buttonMul);
        frame.add(buttonDiv);
        frame.add(buttonEqual);
        frame.add(ac);
        frame.add(buttonPlaceholder);

        // setting the attributes of frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 580);
        frame.setResizable(false);
        frame.setLayout(null);

    }
    public static void main(String[] args) {
        new Calculator();
    }
}
