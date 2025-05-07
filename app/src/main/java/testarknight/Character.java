package testarknight;

import java.awt.*;
import javax.swing.*;

public class Character extends JPanel {
    
    public Character(String charName, String charImageDir) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        JLabel charImage = new JLabel(new ImageIcon(getClass().getResource(charImageDir)));
        JLabel charName2 = new JLabel(charName);
        charImage.setAlignmentX(CENTER_ALIGNMENT);
        charImage.setSize(256, 256);
        charName2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        charName2.setAlignmentX(CENTER_ALIGNMENT);
        add(charImage);
        add(charName2);
    }
}


