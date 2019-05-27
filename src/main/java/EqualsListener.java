import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.Stack;

public class EqualsListener implements ActionListener {
    EndOfTheLine ToJEstJużKoniec=new EndOfTheLine();
    RPNconverter converter =new RPNconverter();
    private String string;
    private JTextField field;
    private Stack<String> stos;
    private String wynik;

    public EqualsListener(String number, JTextField textField) {
        this.string = string;
        this.field = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        string=field.getText();
        stos =converter.RPNconverter(string);
        wynik =ToJEstJużKoniec.EndOfTheLine(stos);
        String currentText = field.getText()+"="+wynik;
        field.setText(currentText);
    }




}
