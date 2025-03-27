package Day24;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("A Swing App!");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(1000,1000);

        JLabel jl = new JLabel("Enter your name!");
        JTextField tf = new JTextField(15);
        JButton jb = new JButton("Click me to see magic!");
        JLabel jl2 = new JLabel("");

        // using anony function or lambda expression
        jb.addActionListener((e)->{
                String name = tf.getText();
                jl2.setText("Hello "+name+", Welcome to this App!");
        });

        JPanel jp = new JPanel();
        jp.add(jl);
        jp.add(tf);
        jp.add(jb);
        jp.add(jl2);

        jf.add(jp);
        jf.setVisible(true);
    }
}
