import javax.swing.*;

public class RadioButtonGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Gender Selection");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JButton submit = new JButton("Submit");
        JLabel result = new JLabel();

        submit.addActionListener(e -> {
            if (male.isSelected()) {
                result.setText("Selected: Male");
            } else if (female.isSelected()) {
                result.setText("Selected: Female");
            } else {
                result.setText("Please select gender");
            }
        });

        JPanel panel = new JPanel();
        panel.add(male);
        panel.add(female);
        panel.add(submit);
        panel.add(result);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}