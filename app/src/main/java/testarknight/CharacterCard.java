package testarknight;

import java.awt.*;
import javax.swing.*;

public class CharacterCard extends JButton {
    
    // Constructor for the character cards and location directory
    public CharacterCard(String charName, String charImageDir, String element, int rarity) {

        // Set card foundations
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#3C3C3C"));
        setFocusPainted(false);
        setBorderPainted(false);

        // Create objects for the image, name, and stars rarity
        JLabel charImage = new JLabel(new ImageIcon(getClass().getResource(charImageDir)));
        JLabel charName2 = new JLabel(charName);
        JLabel stars = new JLabel();

        // Set alignments and sizes for the objects
        charImage.setAlignmentX(CENTER_ALIGNMENT);
        charImage.setSize(256, 256);
        charName2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        charName2.setForeground(Color.WHITE);
        charName2.setAlignmentX(CENTER_ALIGNMENT);
        stars.setAlignmentX(CENTER_ALIGNMENT);
        stars.setFont(new Font("Dialog", Font.PLAIN, 20));

        // Creates 4 pretty pointed stars label objects depending on character rarity
        if (rarity == 4) {
            stars.setText("✦✦✦✦");
            stars.setForeground(Color.MAGENTA);
        } else if (rarity == 5) {
            stars.setText("✦✦✦✦✦");
            stars.setForeground(Color.YELLOW);
        }

        // Adding all objects to the card layout
        add(charImage);
        add(charName2);
        add(Box.createVerticalStrut(5));
        add(new ElementName(element));
        add(Box.createVerticalStrut(5));
        add(stars);

        // Do an action when card is clicked by mouse
        addActionListener(new ButtonOnClick(this));
    }
}


