import javax.swing.*;

public class Frame2 {
    JFrame f;
    JLabel l;

    public Frame2() {
        f = new JFrame("Frame 2");
        l = new JLabel("This is Frame 2");
        l.setBounds(20, 50, 200, 20); // Set the bounds for the label
        f.setLayout(null); // Set the layout manager for the frame
        f.setSize(300, 300);
        f.setVisible(true);

        f.setDefaultCloseOperation(3);        f.add(l);
    }

    public static void main(String[] args) {
        new Frame2();
    }
}
