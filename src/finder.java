import daniloramirezcr.FullContact.FullContact;
import daniloramirezcr.util.Config;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by danilo on 16/12/2016.
 */
public class finder extends JFrame implements ActionListener {

    private JLabel emailInstructions;
    private JTextField email;
    private JButton SearchButton;

    public finder() {
        //this.SearchButton.addActionListener( this.botonActionPerformed(  ) );
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public void finder(){

    }

    private void start_search(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("button1")) {

        }
    }

}
