package testarknight;

import java.awt.*;
import javax.swing.*;

public class SidebarButtons extends JButton {
    
    // Constructor for the sidebar navigation buttons
    public SidebarButtons(String text) {
        setText(text);
        setForeground(Color.WHITE);
        setBackground(Color.GRAY);
        setFont(new Font("Segoe UI", Font.BOLD, 15));
        setAlignmentX(CENTER_ALIGNMENT);
        setBorder(BorderFactory.createEmptyBorder());
        setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        
    }
}
