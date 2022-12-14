import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

       // frame.setSize(1920, 1080);
       // frame.setVisible(true);

        ImageIcon image = new ImageIcon("Gaius.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.gray);

        JLabel l1, l2;
        JTextField t1, t2;
        JButton b1, b2, b3;

        l1 = new JLabel("SEK");
        l1.setBounds(20,40,60,30);
        l2 = new JLabel("Quid");
        l2.setBounds(170,40,60,30);

        t1 = new JTextField("0");
        t1.setBounds(80,40,50,30);
        t2 = new JTextField("0");
        t2.setBounds(240,40,50,30);

        b1 = new JButton("SEK");
        b1.setBounds(50,80,60,15);
        b2 = new JButton("GBP");
        b2.setBounds(190,80,60,15);
        b3 = new JButton("Close");
        b3.setBounds(150,150,60,30);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(t1.getText());
                double d1 = (d / 12.62);

                String s1 = String.valueOf(d1);
                t2.setText(s1);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double d2 = Double.parseDouble(t1.getText());
                double d3 = (d2 / 12.62);

                String s2 = String.valueOf(d3);
                t1.setText(s2);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(l1);
        frame.add(l2);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.add(b2);
        frame.add(b2);

        frame.setLayout(null);
        frame.setSize(1920, 1080);
        frame.setVisible(true);
    }

}