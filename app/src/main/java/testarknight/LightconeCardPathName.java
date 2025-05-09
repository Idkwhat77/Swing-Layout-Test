package testarknight;

import java.awt.*;
import javax.swing.*;

public class LightconeCardPathName extends JPanel {

    private String directory;

    public LightconeCardPathName(String path) {

        // Set panel foundation
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setOpaque(false);

        // Check which path the light cone is
        if (path.equals("Destruction")) {
            directory = "/path_type/destruction.png";
        } else if (path.equals("Hunt")) {
            directory = "/path_type/hunt.png";
        } else if (path.equals("Erudition")) {
            directory = "/path_type/erudition.png";
        } else if (path.equals("Harmony")) {
            directory = "/path_type/harmony.png";
        } else if (path.equals("Nihility")) {
            directory = "/path_type/nihility.png";
        } else if (path.equals("Abundance")) {
            directory = "/path_type/abundance.png";
        } else if (path.equals("Preservation")) {
            directory = "/path_type/preservation.png";
        } else if (path.equals("Remembrance")) {
            directory = "/path_type/remembrance.png";
        }

        // Create image and name objects and set the image and fixed size as 16x16
        ImageIcon icon = new ImageIcon(getClass().getResource(directory));
        Image image = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        JLabel pathImage = new JLabel(new ImageIcon(image));
        JLabel pathName = new JLabel(path);
        pathName.setForeground(Color.white);
        pathName.setFont(new Font("Segoe UI", Font.BOLD, 10));

        // Adding image and path text to the panel
        add(pathImage);
        add(Box.createHorizontalStrut(3));
        add(pathName);
    }
}