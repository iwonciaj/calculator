import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DelListener implements ActionListener {
    private String string;
    private JTextField field;
    private int len;

    public DelListener( JTextField textField) {

        this.field = textField;
    }
    @Override
    public void actionPerformed (ActionEvent e){
        String currentText = field.getText();
        len=currentText.length();
        len-=1;
        string=currentText.substring(0,len);
        currentText=string;
        field.setText(currentText);

    }
}
