import java.awt.event.*;
import javax.swing.*;

public class stopwatch extends JFrame implements Runnable, ActionListener {

    JLabel label;

    JButton start, stop;

    int seconds = 0;

    Thread t;

    boolean running = false;

    stopwatch() {

        label = new JLabel("0");

        start = new JButton("Start");

        stop = new JButton("Stop");

        label.setBounds(180, 50, 100, 30);

        start.setBounds(100, 120, 80, 30);

        stop.setBounds(200, 120, 80, 30);

        add(label);

        add(start);

        add(stop);

        start.addActionListener(this);

        stop.addActionListener(this);

        setTitle("Stopwatch");

        setSize(400, 300);

        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void run() {

        while (running) {

            seconds++;

            label.setText("Time: " + seconds);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == start) {

            running = true;

            t = new Thread(this);

            t.start();
        }

        if (e.getSource() == stop) {

            running = false;
        }
    }

    public static void main(String[] args) {

        new stopwatch();
    }
}