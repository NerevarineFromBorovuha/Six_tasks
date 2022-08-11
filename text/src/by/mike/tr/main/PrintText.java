package by.mike.tr.main;

public class PrintText {
	public void printText(Text text) {
		System.out.println(text.getTitle());
		for (Sentence s : text.getText()) {
			System.out.println(createString(s));

		}
	}

	private String createString(Sentence s) {
		String sent = "";
		for (Word w : s.getSentence()) {
			sent = sent + w.getWord();
		}
		return sent;
	}

}
