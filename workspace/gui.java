import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gui implements Runnable {
    public void run() {
        final JFrame startWindow = new JFrame("Connect 4");
        // Set window properties
        startWindow.setLocation(300,100);
        startWindow.setResizable(false);
        startWindow.setSize(260, 240);
        
        Box components = Box.createVerticalBox();
        startWindow.add(components);
        
        // Game title
        final JPanel titlePanel = new JPanel();
        components.add(titlePanel);
        final JLabel titleLabel = new JLabel("Connect 4");
        titlePanel.add(titleLabel);
    }
}
