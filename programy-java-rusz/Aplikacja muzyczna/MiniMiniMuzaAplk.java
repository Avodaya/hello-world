import javax.sound.midi.*;
public class MiniMiniMuzaAplk {
	
	public static void main(String[] args) {
		MiniMiniMuzaAplk mini = new MiniMiniMuzaAplk();
		if (args.length < 2) {
			System.out.println("Nie zapomnij podac argumentow okreslajacych instrument i nute");
		} else {
			int instrument = Integer.parseInt(args[0]);
			  
	}
	
	public void graj() {
		try {
			Sequencer sekwenser = MidiSystem.getSequencer();
			sekwenser.open();
			
			Sequence sekw = new Sequence(Sequence.PPQ, 4);
			
			Track sciezka = sekw.createTrack();
			
			ShortMessage pierwszy = new ShortMessage();
			pierwszy.setMessage(192, 1, 102, 0);
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent nutaP = new MidiEvent(a, 1);
			sciezka.add(nutaP);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent nutaK = new MidiEvent(b, 16);
			sciezka.add(nutaK);
			
			sekwenser.setSequence(sekw);
			
			sekwenser.start();
		} catch (Exception ex) {ex.printStackTrace();}
	}
}