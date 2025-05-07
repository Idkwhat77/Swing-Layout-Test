package testarknight;

import java.awt.*;
import javax.swing.*;

public class NavbarButtons extends JButton {
    
    // Constructor for the navbar discord and kofi buttons
    public NavbarButtons(String text, String color) {
        setText(text);
        setForeground(Color.WHITE);
        setBackground(Color.decode(color));
        setFocusPainted(false);
        setFont(new Font("Segoe UI", Font.BOLD, 12));
        setBorder(BorderFactory.createEmptyBorder(7,10,7,10)); 
    }
}
