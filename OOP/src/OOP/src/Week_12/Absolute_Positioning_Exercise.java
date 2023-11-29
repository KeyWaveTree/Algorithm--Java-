package OOP.src.Week_12;

import javax.swing.*;
import java.awt.*;

public class Absolute_Positioning_Exercise extends JFrame
{
    protected Absolute_Positioning_Exercise()
    {
        setTitle("Absolute Positioning Exercise");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        JLabel label = new JLabel("This is a JLabel");
        label.setBounds(50, 30, 150, 20);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");

        button1.setBounds(140, 140, 80 , 30);
        button2.setBounds(240, 240, 80 , 30);
        button3.setBounds(340, 340, 80 , 30);

        contentPane.add(label);
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);

        setVisible(true);
    }

    public static void main(String[] args) {
        Absolute_Positioning_Exercise ape = new Absolute_Positioning_Exercise();
    }
}
