import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BouncingBall extends JPanel implements Runnable, MouseListener {

    int x = 50, y = 50;
    int dx = 2, dy = 2;

    Thread t;

    BouncingBall() {
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);

        g.fillOval(x, y, 40, 40);
    }

    public void run() {

        while (true) {

            x = x + dx;
            y = y + dy;

            if (x <= 0 || x >= getWidth() - 40) {
                dx = -dx;
            }

            if (y <= 0 || y >= getHeight() - 40) {
                dy = -dy;
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }

    public void mousePressed(MouseEvent e) {

        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Bouncing Ball");

        BouncingBall b = new BouncingBall();

        f.add(b);

        f.setSize(500, 400);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}