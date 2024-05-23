import javax.swing.*;
public class Calculator {
    JFrame J;
    JLabel f,l,r;
    JTextField fn,ln,rn;
    JButton add,sub,mul,div;
    public Calculator()
    {
        J=new JFrame("calculator");
        f=new JLabel("Fnum");
        l=new JLabel("lnum");
        r=new JLabel("result");
        fn=new JTextField(25);
        ln=new JTextField(25);
        rn=new JTextField(25);
        add=new JButton("add");
        sub=new JButton("sub");
        mul=new JButton("mul");
        div=new JButton("div");
        J.setSize(500,500);
        J.setVisible(true);
        J.setDefaultCloseOperation(3);
        J.setLayout(null);
        f.setBounds(20,50,100,20);
        fn.setBounds(150,50,100,20);
        l.setBounds(20,100,100,20);
        ln.setBounds(150,100,100,20);
        add.setBounds(20, 150, 50, 20);
        sub.setBounds(80,150,50,20);
        mul.setBounds(140,150,50,20);
        div.setBounds(200,150,50,20);
        r.setBounds(20,200,100,20);
        rn.setBounds(150,200,100,20);

      
        J.add(f);
        J.add(fn);
        J.add(l);
        J.add(ln);
        J.add(add);
        J.add(sub);
        J.add(mul);
        J.add(div);
        J.add(r);
        J.add(rn);
    }

    

public static void main(String[] args) {
    new Calculator();
}
}
