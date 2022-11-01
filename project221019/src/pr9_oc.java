import java.awt.*;
import javax.swing.*;

public class pr9_oc extends JFrame{
    pr9_oc(){
        setTitle("Open Challenge 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new NorthPanel_oc(),BorderLayout.NORTH);
        c.add(new CenterPanel_oc(),BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);

    }
    public static void main(String[] args) {
        new pr9_oc();
    }

}
class NorthPanel_oc extends JPanel{
    NorthPanel_oc(){
        setBackground(Color.LIGHT_GRAY);
        this.add(new JButton("Open"));
        this.add(new JButton("Read"));
        this.add(new JButton("Close"));
    }
}
class CenterPanel_oc extends JPanel{ // CENTER에 붙일 패널
    CenterPanel_oc(){
        this.setLayout(null);
        String text[] = {"Hello", "Java", "Love"};
        int x;
        int y;
        JLabel label;
        for(int i=0;i<3;i++) {
            x = (int)(Math.random()*250); // 글자 짤림 방지를 위해 50의 여유를 남김
            y = (int)(Math.random()*250);
            label = new JLabel(text[i]);
            label.setLocation(x, y); // 랜덤위치에 label 붙이기
            label.setSize(50,10); // label 크기 설정
            this.add(label);
        }
    }
}