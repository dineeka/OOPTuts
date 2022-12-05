package Tutorial8;

import java.awt.*;
import javax.swing.*;

public class CalculatorFrame extends JFrame{
    public CalculatorFrame(){
        JPanel p1= new JPanel();
        p1.setLayout(new GridLayout(4,3,10,10));

        for(int i=1; i<10; i++){
            p1.add(new JButton(" " +i));
        }

        p1.add(new JButton("0"));
        p1.add(new JButton("."));

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,1,10,10));

        p2.add(new JButton("+"));
        p2.add(new JButton("-"));
        p2.add(new JButton("Clear"));

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1,2));

        JTextField t1 = new JTextField(" ");
        t1.setBackground(Color.green);

        p3.add(p1, BorderLayout.WEST);
        p3.add(p2, BorderLayout.EAST);

        p1.setBackground(Color.pink);
        p2.setBackground(Color.orange);

        this.add(t1, BorderLayout.NORTH);
        this.add(p3, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        CalculatorFrame myCalculator = new CalculatorFrame();
        myCalculator.setVisible(true);
        myCalculator.setSize(600, 300);
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
