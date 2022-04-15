package forum;

import model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame {
    private JPanel menu;
    private JLabel title;
    private JButton lionButton;
    private JButton catButton;
    private JButton dolphineButton;
    private JButton lizardButton;


    public Menu() { // configure
        setTitle("Animal - menu");
        setPreferredSize(new Dimension(800,600));
        setContentPane(menu);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        lionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // fetch the info form Lion Class


            }
        });{

        }


    }


}    // end of the class

