import java.awt.*;
import javax.swing.*;

public class flowlayout extends JFrame {

    flowlayout() {
        setTitle("FlowLayout Example");
        setSize(300, 150);

        // FlowLayout: left aligned, hgap=10, vgap=20
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        JCheckBox java = new JCheckBox("Java");
        JCheckBox python = new JCheckBox("Python");
        JCheckBox cpp = new JCheckBox("C++");

        add(java);
        add(python);
        add(cpp);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new flowlayout();
    }
}