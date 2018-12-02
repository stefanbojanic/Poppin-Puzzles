package ui;

import javax.swing.*;
import java.awt.*;

public class Notification extends JFrame {

    public Notification(String msg) {
        super("Notification");
        setSize(100,100);
        JPanel panel = new JPanel();
        JLabel label = new JLabel(msg);
        panel.add(label);
        panel.setBackground(Color.pink);
        setContentPane(panel);
        setVisible(true);
    }

    //MODIFIES: this
    //EFFECTS: sets title, dimensions, location of UI
    public void center() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screenSize.width / 2 - getWidth() / 2;
        int y = screenSize.height / 2 - getHeight() / 2;
        setLocation(x, y);
    }
}
