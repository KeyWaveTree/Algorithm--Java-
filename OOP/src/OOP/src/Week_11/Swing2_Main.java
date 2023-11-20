package OOP.src.Week_11;

import javax.swing.*;
import java.awt.*;

public class Swing2_Main extends JFrame
{
    protected Swing2_Main()
    {
        setTitle("202203493 ChoiDamrok");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 300);


        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));

        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");

        contentPane.add(b1);
        contentPane.add(b2);
        contentPane.add(b3);
        contentPane.add(b4);
        contentPane.add(b5);

        setVisible(true);
    }
    public static void main(String[] args) {
        Swing2_Main swing2_main = new Swing2_Main();
    }
}
