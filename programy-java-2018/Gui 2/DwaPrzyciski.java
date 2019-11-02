import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DwaPrzyciski {
	JFrame ramka;
	JLabel etykieta;
	
	public static void main(String[] args) {
		DwaPrzyciski gui = new DwaPrzyciski();
		gui.doRoboty();
	}
	
	public void doRoboty() {
		ramka = new JFrame();
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton przyciskKolor = new JButton("Zmień kolor");
		przyciskKolor.addActionListener(new KolorListener());
		
		JButton przyciskEtyk = new JButton("Zmień etykietę");
		przyciskEtyk.addActionListener(new EtykietaListener());
		
		etykieta = new JLabel("Oto etykieta");
		MojPanelRysunkowy panel = new MojPanelRysunkowy();
		
		ramka.getContentPane().add(BorderLayout.SOUTH, przyciskKolor);
		ramka.getContentPane().add(BorderLayout.CENTER, panel);
		ramka.getContentPane().add(BorderLayout.EAST, przyciskEtyk);
		ramka.getContentPane().add(BorderLayout.WEST, etykieta);
		ramka.setSize(400,300);
		ramka.setVisible(true);
	}
	
	
	class EtykietaListener implements ActionListener {
		public void actionPerformed(ActionEvent zdarzenie) {
			etykieta.setText("Auuuuuu!");
		}
	}
	
	class KolorListener implements ActionListener {
		public void actionPerformed(ActionEvent zdarzenie) {
			ramka.repaint();
		}
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