import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by alexander on 2018-05-02.
 */
public class Ingame extends JPanel{

    private JTextField Cord;
    private JPanel panel1;
    private JLabel label;


    public Ingame(Player p) {

        JFrame frame = new JFrame("Ingame");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        label.setText(p.getPosition().getX() + " " + p.getPosition().getY());
        frame.setVisible(true);

    }


}


