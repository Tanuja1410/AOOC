import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gridlayout extends JFrame implements ActionListener {

    JButton[] buttons = new JButton[6];
    JButton firstClicked = null;

    gridlayout() {
        setTitle("GridLayout Example");
        setSize(300, 200);

        setLayout(new GridLayout(2, 3, 5, 5));

        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (firstClicked == null) {
            firstClicked = clicked;
        } else {
            // Swap values
            String temp = firstClicked.getText();
            firstClicked.setText(clicked.getText());
            clicked.setText(temp);

            firstClicked = null;
        }
    }

    public static void main(String[] args) {
        new gridlayout();
    }
}