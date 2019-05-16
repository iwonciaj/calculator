
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {



    JFrame frame = new JFrame();
    // GridLayout layout = new GridLayout(2, 1);
    GridLayout panelLayout = new GridLayout(5,7);
    JPanel panel = new JPanel();

    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPercent = new JButton("%");
    JButton button0 = new JButton("0");
    JButton dot = new JButton(".");
    JButton equal = new JButton("=");
    JButton add = new JButton("+");
    JButton minus = new JButton("-");
    JButton delete = new JButton("DEL");
    JButton ac = new JButton("AC");
    JButton multiply = new JButton("x");
    JButton divide = new JButton("/");
    JButton pi = new JButton("PI");
    JButton potega = new JButton("X^y");
    JButton sqt = new JButton("sqrt(X)");
    JButton sin = new JButton("sin");
    JButton cos = new JButton("cos");
    JButton tan = new JButton("tan");
    JButton ctan = new JButton("ctan");
    JButton nawiasLewy = new JButton("(");
    JButton nawiasPrawy = new JButton(")");
    JButton log = new JButton("log");
    JButton silnia = new JButton("X!");




    JTextField field = new JTextField();


    public void setFrame() {
        frame.setSize(new Dimension(500, 600));
        frame.add(field);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        field.setBounds(0,0,500,75);
        field.setEditable(false);
        frame.setLayout(null);
        panel.setBounds(0,76,500,500);
        panel.setLayout(panelLayout);
        panel.add(nawiasLewy);panel.add(nawiasPrawy);panel.add(pi);panel.add(divide);panel.add(multiply);panel.add(ac);
        panel.add(log);panel.add(potega);panel.add(button1);panel.add(button2);panel.add(button3);panel.add(delete);
        panel.add(silnia);panel.add(sqt);panel.add(button4);panel.add(button5);panel.add(button6);panel.add(minus);
        panel.add(tan);panel.add(sin);panel.add(button7);panel.add(button8);panel.add(button9);panel.add(add);
        panel.add(ctan);panel.add(cos);panel.add(buttonPercent);panel.add(button0);panel.add(dot);panel.add(equal);


        //Kolorki!!!
        dot.setBackground(Color.LIGHT_GRAY);
        add.setBackground(Color.LIGHT_GRAY);
        minus.setBackground(Color.LIGHT_GRAY);
        delete.setBackground(Color.LIGHT_GRAY);
        ac.setBackground(Color.LIGHT_GRAY);
        multiply.setBackground(Color.LIGHT_GRAY);
        divide.setBackground(Color.LIGHT_GRAY);
        pi.setBackground(Color.LIGHT_GRAY);
        buttonPercent.setBackground(Color.LIGHT_GRAY);

        equal.setBackground(Color.PINK);

        button0.setBackground(Color.white);
        button1.setBackground(Color.white);
        button2.setBackground(Color.white);
        button3.setBackground(Color.white);
        button4.setBackground(Color.white);
        button5.setBackground(Color.white);
        button6.setBackground(Color.white);
        button7.setBackground(Color.white);
        button8.setBackground(Color.white);
        button9.setBackground(Color.white);


        nawiasLewy.setBackground(Color.gray);
        nawiasPrawy.setBackground(Color.gray);
        log.setBackground(Color.gray);
        potega.setBackground(Color.gray);
        silnia.setBackground(Color.gray);
        sqt.setBackground(Color.gray);
        tan.setBackground(Color.gray);
        sin.setBackground(Color.gray);
        cos.setBackground(Color.gray);
        ctan.setBackground(Color.gray);

        button0.addActionListener(new NumericButtonActionListeners(0, field));
        button9.addActionListener(new NumericButtonActionListeners(9,field));
        button8.addActionListener(new NumericButtonActionListeners(8,field));
        button7.addActionListener(new NumericButtonActionListeners(7,field));
        button6.addActionListener(new NumericButtonActionListeners(6,field));
        button5.addActionListener(new NumericButtonActionListeners(5,field));
        button4.addActionListener(new NumericButtonActionListeners(4,field));
        button3.addActionListener(new NumericButtonActionListeners(3,field));
        button2.addActionListener(new NumericButtonActionListeners(2,field));
        button1.addActionListener(new NumericButtonActionListeners(1,field));

        add.addActionListener(new OperatorActionListener("+",field));
        minus.addActionListener(new OperatorActionListener("-",field));
        divide.addActionListener(new OperatorActionListener("/",field));
        multiply.addActionListener(new OperatorActionListener("*",field));
        dot.addActionListener(new OperatorActionListener(".",field));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
