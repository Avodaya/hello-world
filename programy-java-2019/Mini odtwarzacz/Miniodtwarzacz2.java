import javax.sound.midi.*;

class Miniodwarzacz2 implements ControllerEventListener {
	public static void main(String[] args) {
		Miniodwarzacz2 mini = new Miniodwarzacz2();
		mini.doRoboty();
	}
	
	public void doRoboty() {	
		try {
			Sequencer sekwenser = MidiSystem.getSequencer();
			sekwenser.open();
			
			int[] zdarzeniaObslugiwane = {127};
			sekwenser.addControllerEventListener (this, zdarzeniaObslugiwane);
			
			Sequence sekw = new Sequence(Sequence.PPQ, 4);
			Track sciezka = sekw.createTrack();
			
			for (int i = 5; i < 61; i+=4) {
				sciezka.add(tworzZdarzenie(144,1,i,100,i));
				
				sciezka.add(tworzZdarzenie(176,1,127,0,i));
				
				sciezka.add(tworzZdarzenie(144,1,i,100,i + 2));
			}
			
			sekwenser.setSequence(sekw);
			sekwenser.setTempoInBPM(220);
			sekwenser.start();
		} catch (Exception ex) { ex.printStackTrace(); }
	}
	
	public void controlChange(ShortMessage zdarzenie) {
		System.out.println("la");
	}
				


	public static MidiEvent tworzZdarzenie(int plc, int kanal, int jeden, int dwa, int tekst) {
		MidiEvent zdarzenie = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(plc, kanal, jeden, dwa);
			zdarzenie = new MidiEvent(a, tekst);
		} catch(Exception e) { }
		return zdarzenie;
	}
}
