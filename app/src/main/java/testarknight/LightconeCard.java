package testarknight;

import java.awt.*;
import javax.swing.*;

public class LightconeCard extends JButton {
    
    // Constructor for the light cone cards and location directory
    public LightconeCard(String coneName, String coneImageDir, String path, int rarity) {

        // Set card foundations
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.decode("#3C3C3C"));
        setFocusPainted(false);
        setBorderPainted(false);

        // Create objects for the image + scaling, name, and stars rarity
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(coneImageDir));
        Image scaledImage = originalIcon.getImage().getScaledInstance(256, 300, Image.SCALE_SMOOTH);
        JLabel coneImage = new JLabel(new ImageIcon(scaledImage));

        JLabel coneName2 = new JLabel(coneName);
        JLabel stars = new JLabel();

        // Set alignments and sizes for the objects
        coneImage.setAlignmentX(CENTER_ALIGNMENT);
        coneImage.setSize(256, 256);
        coneName2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        coneName2.setForeground(Color.WHITE);
        coneName2.setAlignmentX(CENTER_ALIGNMENT);
        stars.setAlignmentX(CENTER_ALIGNMENT);
        stars.setFont(new Font("Dialog", Font.PLAIN, 20));

        // Creates 4 pretty pointed stars label objects depending on light cone rarity
        if (rarity == 3) {
            stars.setText("✦✦✦");
            stars.setForeground(Color.WHITE);
        }
        else if (rarity == 4) {
            stars.setText("✦✦✦✦");
            stars.setForeground(Color.MAGENTA);
        } 
        else if (rarity == 5) {
            stars.setText("✦✦✦✦✦");
            stars.setForeground(Color.YELLOW);
        }

        // Adding all objects to the card layout
        add(coneImage);
        add(coneName2);
        add(Box.createVerticalStrut(5));
        add(new LightconeCardPathName(path));
        add(Box.createVerticalStrut(5));
        add(stars);

        // Do an action when card is clicked by mouse
        addActionListener(new CharacterCardOnClick(this));
    }
}


