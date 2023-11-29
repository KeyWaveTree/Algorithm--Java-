package OOP.src.Week_12;

import OOP.src.Week_11.Swing2_Main;

import javax.swing.*;
import java.awt.*;

public class Swing_Main extends JFrame {
    protected Swing_Main()
    {
        setTitle("202203493 ChoiDamrok");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane =getContentPane();

        contentPane.setLayout(new BorderLayout(40, 20));

        JButton add = new JButton("add");
        JButton div = new JButton("div");
        JButton mul = new JButton("mul");
        JButton sub = new JButton("sub");
        JButton cal = new JButton("calculate");

        contentPane.add(add, BorderLayout.CENTER);
        contentPane.add(div, BorderLayout.NORTH);
        contentPane.add(mul, BorderLayout.EAST);
        contentPane.add(sub, BorderLayout.WEST);
        contentPane.add(cal, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        Swing_Main main = new Swing_Main();
    }
}
