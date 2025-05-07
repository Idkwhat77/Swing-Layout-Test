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

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(button, "You clicked the button!");
    }
}
