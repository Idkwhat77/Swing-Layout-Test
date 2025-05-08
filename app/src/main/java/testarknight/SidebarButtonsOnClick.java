package testarknight;

import java.awt.event.*;
import javax.swing.*;

public class SidebarButtonsOnClick implements ActionListener {
    private JSplitPane splitPane;
    private JPanel newRightPanel;

    public SidebarButtonsOnClick(JSplitPane splitPane, JPanel newRightPanel) {
        this.splitPane = splitPane;
        this.newRightPanel = newRightPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JScrollPane scrollPane = new JScrollPane(newRightPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(32);
        scrollPane.getHorizontalScrollBar().setUnitIncrement(32);
        scrollPane.setBorder(null); // Remove ugly thin blue line around the panel grr
        splitPane.setDividerLocation(240);
        splitPane.setRightComponent(scrollPane);
        
    }
}
