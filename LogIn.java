import java.util.Scanner;

import javax.swing.JOptionPane;

public class LogIn{
    JOptionPane login = new JOptionPane();
        String password = "Zenith";
        String username = "employee";
        String newPassword, user_name;
        Scanner userInput = new Scanner(System.in);

        LogIn()
        {
          user_name = login.showInputDialog(login, "Enter username: ", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
        newPassword = login.showInputDialog(login, "Enter password: ", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
        }

       public void checkPassword()
        {
            while((username.compareTo(user_name) != 0) || (password.compareTo(newPassword) != 0))
            {
            login.showMessageDialog(login, "WRONG INPUTS");
              user_name = login.showInputDialog(login, "Enter username: ", "LOGIN", JOptionPane.INFORMATION_MESSAGE); 
            newPassword= login.showInputDialog(login, "Enter password: ", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
            }
          login.showMessageDialog(login, "SUCCESSFUL LOGIN", "WELCOME", JOptionPane.PLAIN_MESSAGE);
        }
    }