import javax.swing.*;

public class MyGUIApp {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("My GUI App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Add the button to the frame
        frame.getContentPane().add(button);

        // Display the frame
        frame.setVisible(true);
    }
}
