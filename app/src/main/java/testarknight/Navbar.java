package testarknight;

import java.awt.*;
import javax.swing.*;

public class Navbar extends JPanel {
    
    // Constructor for the navbar
    public Navbar() {

        // Set Navbar foundation
        setLayout(new BorderLayout());
        setBackground(Color.decode("#232323"));
        setBorder(BorderFactory.createEmptyBorder(7, 10, 7, 15)); // Border Padding 

        // Creating panel for the buttons and set functionality
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        NavbarButtons discordButton = new NavbarButtons("Join Discord", "#5865F2");
        NavbarButtons kofiButton = new NavbarButtons("Buy us a Ko-Fi", "#E53C5B");
        discordButton.addActionListener(new DiscordOnClick(discordButton));
        kofiButton.addActionListener(new KofiOnClick(kofiButton));
        buttonPanel.setOpaque(false);
        buttonPanel.add(discordButton);
        buttonPanel.add(kofiButton);
        
        // Adding the tittle and buttons to the panel
        add(new Title(), BorderLayout.WEST);
        add(buttonPanel, BorderLayout.EAST);
        
    }
}
