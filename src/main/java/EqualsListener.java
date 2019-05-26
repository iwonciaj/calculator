import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

public class EqualsListener implements ActionListener {
    RPNconverter converter =new RPNconverter();
    private String string;
    private JTextField field;

    public EqualsListener(String number, JTextField textField) {
        this.string = string;
        this.field = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        string=field.getText();
        System.out.println(converter.RPNconverter(string));
    }
}
