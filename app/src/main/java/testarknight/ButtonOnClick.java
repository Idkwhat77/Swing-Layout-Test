package testarknight;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonOnClick implements ActionListener {

    private JButton button;

    public ButtonOnClick(JButton button) {
        this.button = button;
    }

    // Create one of those error message type boxes when button clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(button, "You clicked the button!");
    }
}
