package by.mike.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
	private String title;
	private List<Sentence> text;

	public Text() {
		text = new ArrayList<Sentence>();
	}

	public Text(List<Sentence> sentences) {
		text = new ArrayList<Sentence>();
		text.addAll(sentences);

	}

	public boolean add(Sentence sentence) {
		text.add(sentence);
		return true;

	}

	public boolean add(int index, Sentence sentence) {
		if (index < 0 || index > text.size()) {
			return false;
		}
		text.add(index, sentence);
		return true;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		return Objects.hash(text, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		return Objects.equals(text, other.text) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Text [title=" + title + ", text=" + text + "]";
	}

}
