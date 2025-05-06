package testarknight;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sidebar extends JPanel {
    
    public Sidebar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.BLACK);
        add(new MenuItem("Home"));
        add(new MenuItem("Characters"));
        add(new MenuItem("Tier List"));
        add(new MenuItem("Memory of Chaos"));
        add(new MenuItem("Light Cones"));
        add(new MenuItem("Relics"));
        add(new MenuItem("Guides"));
        add(new MenuItem("Tools"));
    }
}
