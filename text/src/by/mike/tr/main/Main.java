package by.mike.tr.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	/*
	 * 5. Создать объект класса Текст, используя классы Предложение, Слово. Методы:
	 * дополнить текст, вывести на консоль текст, заголовок текста.
	 */

	public static void main(String[] args) {

		List<Word> s1 = new ArrayList<Word>();
		s1.add(new Word("I "));
		s1.add(new Word("go "));
		s1.add(new Word("to "));
		s1.add(new Word("library. "));
		List<Word> s2 = new ArrayList<Word>();
		s2.add(new Word("After "));
		s2.add(new Word("library "));
		s2.add(new Word("I "));
		s2.add(new Word("will "));
		s2.add(new Word("go "));
		s2.add(new Word("to the cinema."));
		List<Word> s3 = new ArrayList<Word>();
		s3.add(new Word("After "));
		s3.add(new Word("cinema "));
		s3.add(new Word("I "));
		s3.add(new Word("will "));
		s3.add(new Word("go "));
		s3.add(new Word("to the home."));

		Sentence sent1 = new Sentence(s1);
		Sentence sent2 = new Sentence(s2);
		Sentence sent3 = new Sentence(s3);

		Text text = new Text();
		text.setTitle("My day");
		text.add(sent1);
		text.add(sent2);
		text.add(sent3);

		PrintText printer = new PrintText();
		printer.printText(text);

	}

}
