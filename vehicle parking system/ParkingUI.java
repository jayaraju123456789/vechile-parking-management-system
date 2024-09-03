import javax.swing.*;

public class ParkingUI {
    private JPanel panel;
    private JButton reserveButton;
    private JButton payButton;
    private JLabel statusLabel;

    public ParkingUI() {
        panel = new JPanel();
        statusLabel = new JLabel("Welcome to the Parking System!");
        reserveButton = new JButton("Reserve Slot");
        payButton = new JButton("Pay");

        panel.add(statusLabel);
        panel.add(reserveButton);
        panel.add(payButton);

        // Action listeners for buttons
        reserveButton.addActionListener(e -> reserveSlot());
        payButton.addActionListener(e -> makePayment());
    }

    public JPanel getPanel() {
        return panel;
    }

    private void reserveSlot() {
        // Call the parking management module to reserve a slot
        statusLabel.setText("Slot Reserved!");
    }

    private void makePayment() {
        // Call the payment system
        statusLabel.setText("Payment Successful!");
    }
}
