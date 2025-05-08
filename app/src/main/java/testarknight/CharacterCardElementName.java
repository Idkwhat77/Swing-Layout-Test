package testarknight;

import java.awt.*;
import javax.swing.*;

public class CharacterCardElementName extends JPanel {

    private String directory;

    public CharacterCardElementName(String element) {

        // Set panel foundation
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setOpaque(false);

        // Check which element the character is
        if (element.equals("Fire")) {
            directory = "/element_type/fire.png";
        } else if (element.equals("Quantum")) {
            directory = "/element_type/quantum.png";
        } else if (element.equals("Lightning")) {
            directory = "/element_type/lightning.png";
        } else if (element.equals("Ice")) {
            directory = "/element_type/ice.png";
        } else if (element.equals("Physical")) {
            directory = "/element_type/physical.png";
        } else if (element.equals("Imaginary")) {
            directory = "/element_type/imaginary.png";
        } else if (element.equals("Wind")) {
            directory = "/element_type/wind.png";
        } else {
            directory = "/element_type/default.png";
        }

        // Create image and name objects and set the image and fixed size as 16x16
        ImageIcon icon = new ImageIcon(getClass().getResource(directory));
        Image image = icon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        JLabel elementImage = new JLabel(new ImageIcon(image));
        JLabel elementName = new JLabel(element);
        elementName.setForeground(Color.white);
        elementName.setFont(new Font("Segoe UI", Font.BOLD, 10));

        // Adding image and element text to the panel
        add(elementImage);
        add(Box.createHorizontalStrut(3));
        add(elementName);
    }
}
