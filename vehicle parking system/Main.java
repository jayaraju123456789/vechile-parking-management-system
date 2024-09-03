import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Vehicle Parking Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create login panel
        JPanel loginPanel = new JPanel();
        JLabel userLabel = new JLabel("User:");
        JTextField userText = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        loginPanel.add(userLabel);
        loginPanel.add(userText);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordText);
        loginPanel.add(loginButton);

        frame.add(loginPanel);
        frame.setVisible(true);

        // Add action listener for login button
        loginButton.addActionListener(e -> {
            String user = userText.getText();
            String password = new String(passwordText.getPassword());
            if (authenticate(user, password)) {
                // Show parking slot management UI
                frame.setContentPane(new ParkingUI().getPanel());
                frame.revalidate();
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials");
            }
        });
    }

    private static boolean authenticate(String user, String password) {
        // Dummy authentication
        return user.equals("admin") && password.equals("admin");
    }
}
