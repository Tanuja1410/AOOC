import javax.swing.*;
import java.awt.event.*;

public class ReverseNumberGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Reverse Number");

        JTextField input = new JTextField(10);
        JTextField result = new JTextField(10);
        result.setEditable(false);

        JButton btn = new JButton("Reverse");

        btn.addActionListener(e -> {
            String num = input.getText();
            String rev = new StringBuilder(num).reverse().toString();
            result.setText(rev);
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter Number:"));
        panel.add(input);
        panel.add(btn);
        panel.add(new JLabel("Result:"));
        panel.add(result);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}