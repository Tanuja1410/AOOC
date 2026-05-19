import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StationarySystem extends JFrame implements ActionListener {

    JCheckBox notebook, pen, pencil;
    JButton orderBtn;

    final int NOTEBOOK_PRICE = 50;
    final int PEN_PRICE = 30;
    final int PENCIL_PRICE = 10;

    StationarySystem() {
        setTitle("Stationary Purchase System");
        setSize(350, 300);
        setLayout(new FlowLayout());

        JLabel title = new JLabel("Stationary Purchase System");
        title.setFont(new Font("Arial", Font.BOLD, 16));

        notebook = new JCheckBox("Notebook @ 50");
        pen = new JCheckBox("Pen @ 30");
        pencil = new JCheckBox("Pencil @ 10");

        orderBtn = new JButton("Order");
        orderBtn.addActionListener(this);

        add(title);
        add(notebook);
        add(pen);
        add(pencil);
        add(orderBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String message = "";

        if (notebook.isSelected()) {
            String qtyStr = JOptionPane.showInputDialog("Enter Quantity for Notebook:");
            int qty = Integer.parseInt(qtyStr);
            int cost = qty * NOTEBOOK_PRICE;
            total += cost;
            message += "Notebook Quantity: " + qty + " Total: " + cost + "\n";
        }

        if (pen.isSelected()) {
            String qtyStr = JOptionPane.showInputDialog("Enter Quantity for Pen:");
            int qty = Integer.parseInt(qtyStr);
            int cost = qty * PEN_PRICE;
            total += cost;
            message += "Pen Quantity: " + qty + " Total: " + cost + "\n";
        }

        if (pencil.isSelected()) {
            String qtyStr = JOptionPane.showInputDialog("Enter Quantity for Pencil:");
            int qty = Integer.parseInt(qtyStr);
            int cost = qty * PENCIL_PRICE;
            total += cost;
            message += "Pencil Quantity: " + qty + " Total: " + cost + "\n";
        }

        message += "\nTotal: " + total;

        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(this, "Successfully Ordered.", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new StationarySystem();
    }
}