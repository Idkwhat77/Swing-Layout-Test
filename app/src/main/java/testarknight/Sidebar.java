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

        // Sidebar buttons with no target grid yet (character grid is a placeholder)
        add(Box.createVerticalStrut(10));
        SidebarButtons tierListButton = new SidebarButtons("Tier List");
        add(tierListButton);
        tierListButton.addActionListener(new SidebarButtonsOnClick(splitPane, new CharacterGrid()));

        add(Box.createVerticalStrut(10));
        SidebarButtons memoryOfChaosButton = new SidebarButtons("Memory of Chaos");
        add(memoryOfChaosButton);
        memoryOfChaosButton.addActionListener(new SidebarButtonsOnClick(splitPane, new CharacterGrid()));

        add(Box.createVerticalStrut(10));
        SidebarButtons pureFictionButton = new SidebarButtons("Pure Fiction");
        add(pureFictionButton);
        pureFictionButton.addActionListener(new SidebarButtonsOnClick(splitPane, new CharacterGrid()));

        add(Box.createVerticalStrut(10));
        SidebarButtons apocalypticShadowsButton = new SidebarButtons("Apocalyptic Shadows");
        add(apocalypticShadowsButton);
        apocalypticShadowsButton.addActionListener(new SidebarButtonsOnClick(splitPane, new CharacterGrid()));

        add(Box.createVerticalStrut(10));
        SidebarButtons relicsButton = new SidebarButtons("Relics");
        add(relicsButton);
        relicsButton.addActionListener(new SidebarButtonsOnClick(splitPane, new CharacterGrid()));

        add(Box.createVerticalStrut(10));
        SidebarButtons guidesButton = new SidebarButtons("Guides");
        add(guidesButton);
        guidesButton.addActionListener(new SidebarButtonsOnClick(splitPane, new CharacterGrid()));

        add(Box.createVerticalStrut(10));
        SidebarButtons toolsButton = new SidebarButtons("Tools");
        add(toolsButton);
        toolsButton.addActionListener(new SidebarButtonsOnClick(splitPane, new CharacterGrid()));
    }
}
