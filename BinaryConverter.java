import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BinaryConverter {

    public static void main(String[] args) {
        new BinaryConverter();
    }

    private JFrame frame;
    private JButton button;
    private JTextField text;
    private JTextField text2;
    private String decimalnumber = null;

    // Constructor - builds and displays the window.
    public BinaryConverter() {
        frame = new JFrame("Let's Convert!");

        // Create JLabel object for "Binary:" and add it to frame.
        JLabel label = new JLabel("Binary:");
        frame.setLayout(new FlowLayout());
        frame.add(label);

        // Create JTextField object and add it to frame
        text = new JTextField(15);
        frame.add(text);

        // Create JLabel object for "Decimal:" and add it to frame.
        JLabel label2 = new JLabel("Decimal:");
        frame.add(label2);

        // Create JTextField object and add it to frame
        text2 = new JTextField(15);
        frame.add(text2);

        // Create JButton object and add it to frame.
        button = new JButton("Convert");
        button.addActionListener(new ButtonListener());
        frame.add(button);

        // Set frame attributes and make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void Convert() {
        String binary = text.getText(); // inserted binary number
        int i;
        for (i = 0; i < binary.length(); i++) { // The exponent
            char select = binary.charAt(binary.length() - i);
            char number = (char) (select * Math.pow(2, i));
            decimalnumber += number;
        }
    }

    public class ButtonListener implements ActionListener {

        // This method is called automatically when button is clicked.
        // Every Listener must have this method.
        public void actionPerformed(ActionEvent e) {
            BinaryConverter c = new BinaryConverter();
            c.Convert();
            if (button.getText().equals("Convert")) {
                text2.setText(decimalnumber);
                text.getText();
                text2.getText();
            } else {
            }
        }
    }
}