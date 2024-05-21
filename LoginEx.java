//Create login form
import javax.swing.*;
public class LoginEx
{
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1;
    public LoginEx()
    {
        f=new JFrame("Login");
        l1=new JLabel("username");
        l2=new JLabel ("password");
        t1=new JTextField(25);
        p1=new JPasswordField(25);
        b1=new JButton("Login");
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        l1.setBounds(20,50,100,20);
        t1.setBounds(150,50,100,20);
        l2.setBounds(20,100,100,20);
        p1.setBounds(150,100,100,20);
        b1.setBounds(150,150,80,20);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(p1);
        f.add(b1);
    }
    public static void main(String[] args) {
        new LoginEx();
    }
}