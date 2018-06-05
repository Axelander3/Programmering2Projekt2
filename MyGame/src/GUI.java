import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alexander on 2018-02-23.
 */
public class GUI {
    private JTextField usernameTextField;
    private JButton loginButton;
    private JPanel mainPanel;
    private JPasswordField passwordPasswordField;
    private JFrame frame;

    public GUI() {
        frame = new JFrame("GUI");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        loginButton.addActionListener(new Main());
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public JPasswordField getPasswordPasswordField() {
        return passwordPasswordField;
    }
    public void closeGUI() {
        frame.setVisible(false);
    }
}
