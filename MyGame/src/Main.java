import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by alexander on 2018-02-14.
 */
public class Main implements ActionListener {
    private static Game game;
    private static GUI gui;
    private static Ingame ingame;
    public static void main(String[] args) {
        game = new Game();
        gui = new GUI();
        Login login = new Login();


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (game.playerTryLogin(gui.getUsernameTextField().getText(), gui.getPasswordPasswordField().getText())) {
            ingame = new Ingame(game.getPlayer(gui.getUsernameTextField().getText(), gui.getPasswordPasswordField().getText()));
            System.out.println("Login Sucess");
            gui.closeGUI();
        } else {
            System.out.println("Login Failed");
        }
    }
}
