package testarknight;

import java.awt.*;
import javax.swing.*;

public class Sidebar extends JPanel {
    
    // Constructor for the splitpane sidebar
    public Sidebar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#2D2D2D"));
        setBorder(BorderFactory.createEmptyBorder(1,10,1,10));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Home"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Characters"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Tier List"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Memory of Chaos"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Light Cones"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Relics"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Guides"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Tools"));
    }
}
