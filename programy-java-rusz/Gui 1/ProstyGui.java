import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProstyGui implements ActionListener {
	JFrame ramka;

	public static void main(String[] args) {
		ProstyGui apGUI = new ProstyGui();
		apGUI.doDziela();
	}
		
	public void doDziela() {	
		ramka = new JFrame();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton przycisk = new JButton("Zmien kolor");
		przycisk.addActionListener(this);
		
		MojPanelRysunkowy panelR = new MojPanelRysunkowy();
		
		ramka.getContentPane().add(BorderLayout.SOUTH, przycisk);
		ramka.getContentPane().add(BorderLayout.CENTER, panelR);
		ramka.setSize(300,300);
		ramka.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent zdarzenie) {
		ramka.repaint();
	}
}

class MojPanelRysunkowy extends JPanel {
	public void paintComponent(Graphics g) {
	
	int czerwony = (int) (Math.random()*256);
	int zielony = (int) (Math.random()*256);
	int niebieski = (int) (Math.random()*256);
	
	Color kolorLosowy = new Color(czerwony,zielony,niebieski);
	g.setColor(kolorLosowy);
	g.fillOval(70,70,100,100);
	}
}

