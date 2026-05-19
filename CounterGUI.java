import javax.swing.*;
import java.awt.event.*;

public class CounterGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Counter");
        JTextField text = new JTextField("0", 10);

        JButton up = new JButton("Count Up");
        JButton down = new JButton("Count Down");
        JButton reset = new JButton("Reset");

        // Count Up
        up.addActionListener(e -> {
            int value = Integer.parseInt(text.getText());
            text.setText(String.valueOf(value + 1));
        });

        // Count Down
        down.addActionListener(e -> {
            int value = Integer.parseInt(text.getText());
            text.setText(String.valueOf(value - 1));
        });

        // Reset
        reset.addActionListener(e -> text.setText("0"));

        JPanel panel = new JPanel();
        panel.add(new JLabel("Counter"));
        panel.add(text);
        panel.add(up);
        panel.add(down);
        panel.add(reset);

        frame.add(panel);
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}