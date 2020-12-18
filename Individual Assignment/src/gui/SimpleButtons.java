package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleButtons extends JFrame{
    private JPanel panel;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JLabel label;

    public SimpleButtons(){
        //JFrame configurations
        this.setContentPane(panel);
        this.setTitle("SimpleButtons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting JFrame location on the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screenSize.width/2 - 150;
        int y = screenSize.height/2 - 175;
        this.setLocation(x, y);

        //handling events
        this.one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabel("1");
            }
        });
        this.two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabel("2");
            }
        });
        this.three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabel("3");
            }
        });
        this.four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLabel("4");
            }
        });
    }

    //this is to update the label on button clicks
    private void setLabel(String s){
        this.label.setText(s);
    }

    public static void main(String[] args) {
        SimpleButtons gui = new SimpleButtons();
        gui.setSize(300, 350);
        gui.setVisible(true);
    }
}
