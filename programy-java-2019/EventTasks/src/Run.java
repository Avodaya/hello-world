import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Run {
    JButton button1;
    JButton button2;
    JTextArea text;

    public static void main(String[] args) {
        Run apGui = new Run();
        apGui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panelT = new JPanel();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("Start");
        button2 = new JButton("Stop");

        text = new JTextArea(12, 20);
        text.setLineWrap(true);

        button1.addActionListener(new StartButton());
        button2.addActionListener(new StopButton());

        panel.add(button1);
        panel.add(button2);
        panelT.add(text);

        frame.getContentPane().add(BorderLayout.CENTER, panelT);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

    class StopButton implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            text.append("Stop\n");
        }
    }
    class StartButton implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            text.append("Start\n");
        }
    }
}
