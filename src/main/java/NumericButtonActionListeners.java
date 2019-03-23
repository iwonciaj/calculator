
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumericButtonActionListeners implements ActionListener {

    private int number;
    private JTextField field;

    public NumericButtonActionListeners(int number, JTextField textField) {
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
