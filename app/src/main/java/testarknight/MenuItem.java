package testarknight;

import java.awt.*;
import javax.swing.*;

public class MenuItem extends JButton {
    
    public MenuItem(String text) {
        setText(text);
        setForeground(Color.WHITE);
        setBackground(Color.DARK_GRAY);
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setAlignmentX(CENTER_ALIGNMENT);
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    }
}
