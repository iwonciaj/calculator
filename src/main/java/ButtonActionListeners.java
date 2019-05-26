
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListeners implements ActionListener {

    private String number;
    private JTextField field;

    public ButtonActionListeners(String number, JTextField textField) {
        this.number = number;
        this.field = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentText = field.getText();
        currentText += number;
        field.setText(currentText);
    }
}
