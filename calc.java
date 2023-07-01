import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButon;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myfont = new Font("Ink Free", font.Bold, 10);

    double num1=0, num2=0, result=0;
    char operator;

    public void Calcuator(){
        frame = new JFrame("Calc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args){
        Calculator calc = new Calculator();
    }

    public void actionPerformed(ActionEvent e){

    }

    
}