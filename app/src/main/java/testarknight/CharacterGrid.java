package testarknight;

import java.awt.*;
import javax.swing.*;

public class CharacterGrid extends JPanel {
    
    public CharacterGrid() {
        setLayout(new GridLayout(0, 4));
        setBackground(Color.GRAY);
        add(new Character("Acheron", "/acheron.png"));
        add(new Character("Aglaea", "/aglaea.png"));
        add(new Character("Anaxa", "/anaxa.png"));
        add(new Character("Aglaea", "/aglaea.png"));
        add(new Character("Aglaea", "/aglaea.png"));
        add(new Character("Aglaea", "/aglaea.png"));
        add(new Character("Aventurine", "/aventurine.png"));
    }
}
