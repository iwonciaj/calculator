

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorActionListener implements ActionListener {

    private String action;
    private JTextField field;

    public OperatorActionListener(String action, JTextField filed) {
        this.action=action;
        this.field=filed;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String currentText = field.getText();
        currentText += action;
        field.setText(currentText);


    }
}