package swing_listeners_UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myForm {
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JLabel IVA;
    private JLabel Total;
    private JTextPane textPane3;
    private JButton calculate;
    private Container taxPane;

    public myForm() {
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String []args){
        JFrame frame = new JFrame("swing_listeners_UI");
        frame.setContentPane(new myForm().taxPane);
        frame.setVisible(true);
    }
}
