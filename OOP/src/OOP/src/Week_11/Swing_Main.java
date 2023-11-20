package OOP.src.Week_11;
import javax.swing.*;
import java.awt.*;
import java.io.*;
public class Swing_Main extends JFrame
{

    protected Swing_Main()
    {
        setTitle("202203493 ChoiDamrok");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(600, 500);


        Container contentPane = getContentPane();
        contentPane.setBackground(Color.GREEN);
        contentPane.setLayout(null);

        JButton submit = new JButton("Submit");
        JButton edit = new JButton("Edit");
        JButton delete = new JButton("Delete");

        submit.setBounds(0, 0, 120, 50);
        edit.setBounds(0, 51, 120, 50);
        delete.setBounds(0, 102, 120, 50);
        contentPane.add(submit);
        contentPane.add(edit);
        contentPane.add(delete);

        setVisible(true);
    }
    public static void main(String[] args){
        Swing_Main swing_main =new Swing_Main();
    }

}
