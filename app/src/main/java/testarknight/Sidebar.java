package testarknight;

import java.awt.*;
import javax.swing.*;

public class Sidebar extends JPanel {
    
    // Constructor for the splitpane sidebar
    public Sidebar(JSplitPane splitPane) {

        // Sidebar Foundations
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#2D2D2D"));
        setBorder(BorderFactory.createEmptyBorder(1,10,1,10));
        add(Box.createVerticalStrut(10));

        // Creating sidebar buttons and their respecitve action listener's page
        SidebarButtons characterButton = new SidebarButtons("Characters");
        add(characterButton);
        characterButton.addActionListener(new SidebarButtonsOnClick(splitPane, new CharacterGrid()));

        add(Box.createVerticalStrut(10));

        SidebarButtons lightconeButton = new SidebarButtons("Light Cones");
        add(lightconeButton);
        lightconeButton.addActionListener(new SidebarButtonsOnClick(splitPane, new LightconeGrid()));

        // Buttons without action listener implemented yet
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Tier List"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Memory of Chaos"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Pure Fiction"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Apocalyptic Shadows"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Relics"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Guides"));
        add(Box.createVerticalStrut(10));
        add(new SidebarButtons("Tools"));
    }
}
