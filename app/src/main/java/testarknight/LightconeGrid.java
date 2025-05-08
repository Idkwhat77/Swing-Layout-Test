package testarknight;

import java.awt.*;
import javax.swing.*;

public class LightconeGrid extends JPanel {

    public LightconeGrid() {
        
        // Set grid foundation
        setLayout(new GridLayout(0, 4, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));
        setBackground(Color.decode("#2D2D2D"));
        
        // Adding every single HSR character (playable and soon to be playable)
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
        add(new LightconeCard("A Grounded Ascent", "/light_cones/Light_Cone_A_Grounded_Ascent.png", "Imaginary", 5));
    }
}
