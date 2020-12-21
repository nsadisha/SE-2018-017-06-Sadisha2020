package gui;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    private JPanel loginPane;
    private JTextField userName;
    private JPasswordField password;
    private JButton login;
    private JPanel fields;
    private JPanel button;

    public Login() {
        setTitle("Login");
        setContentPane(loginPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(300,350);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screenSize.width/2 - getWidth()/2;
        int y = screenSize.height/2 - getHeight()/2;
        setLocation(x, y);

        this.login.addActionListener(e -> {
            //getting inputs from the user
            String user = userName.getText();
            String pw = String.copyValueOf(password.getPassword());

            System.out.println("Username: "+user + "\tPassword: "+pw);
        });
    }
}
