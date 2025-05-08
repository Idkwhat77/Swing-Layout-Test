package testarknight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DiscordOnClick implements ActionListener{
    
    private JButton button;

    public DiscordOnClick(JButton button) {
        this.button = button;
    }

    public void openWebPage(String url){
        try {         
          java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Open website link when clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        openWebPage("https://discord.com/invite/skibidi-toilet-community-1125820700503052398");
    }
}
