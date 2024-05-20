import javax.swing.*;

public class Frame1 extends JFrame {
    JLabel l1;

    public Frame1() {
        setTitle("Frame 1");
        setSize(300, 300);
        setVisible(true);
        l1 = new JLabel("This is Frame 1");
        setLayout(null);
        l1.setBounds(20, 50, 200, 20);
        add(l1);
        setDefaultCloseOperation(3); // Corrected setDefaultCloseOperation parameter
    }

    public static void main(String[] args) {
        new Frame1();
    }
}
