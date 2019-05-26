import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcListener implements ActionListener {

    private JTextField field;
    public AcListener(JTextField textField) {

        this.field=textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        field.setText("");

    }
}
