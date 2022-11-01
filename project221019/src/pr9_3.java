import java.awt.*;
import javax.swing.*;

public class pr9_3 extends JFrame {
    pr9_3() {
        setTitle("BorderLayout Practice");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new GridLayout(1,10));

        for(int i=0; i<10; i++) {
            c.add(new JButton(i + ""));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new pr9_3();
    }
}
