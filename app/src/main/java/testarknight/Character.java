package testarknight;

import java.awt.*;
import javax.swing.*;

public class Character extends JPanel {
    
    public Character(String charName, String charImageDir) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
        JLabel charImage = new JLabel(new ImageIcon(getClass().getResource(charImageDir)));
        add(charImage);
        add(new JLabel(charName));
    }
}
