package _02_More_Algorithms;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class MorseCodeTranslater {
	String word = "";
	String[] letters;
	String input;
	HashMap<String, Character> alphebet = new HashMap<String, Character>();

	public static void main(String[] args) {
		new MorseCodeTranslater().runner();
	}

	public void setUp() {
		alphebet.put(".-", 'a');
		alphebet.put("-...", 'b');
		alphebet.put("-.-.", 'c');
		alphebet.put("-..", 'd');
		alphebet.put(".", 'e');
		alphebet.put("..-.", 'f');
		alphebet.put("--.", 'g');
		alphebet.put("....", 'h');
		alphebet.put("..", 'i');
		alphebet.put(".---", 'j');
		alphebet.put("-.-", 'k');
		alphebet.put(".-..", 'l');
		alphebet.put("--", 'm');
		alphebet.put("-.", 'n');
		alphebet.put("---", 'o');
		alphebet.put(".--.", 'p');
		alphebet.put("--.-", 'q');
		alphebet.put(".-.", 'r');
		alphebet.put("...", 's');
		alphebet.put("-", 't');
		alphebet.put("..-", 'u');
		alphebet.put("...-", 'v');
		alphebet.put(".--", 'w');
		alphebet.put("-..-", 'x');
		alphebet.put("-.--", 'y');
		alphebet.put("--..", 'z');
	}

	public void runner() {
		setUp();
		input = JOptionPane.showInputDialog("Enter Morse Code here. put a / to indicate a new letter.");
		solve();
		for (int i = 0; i < letters.length; i++) {
			word += letters[i];
		}
		JOptionPane.showMessageDialog(null, word);
	}

	public Character translate(String morseCode) {
		try {
			return alphebet.get(morseCode);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	public void split() {
		letters = input.split("/");
	}

	public void solve() {
		split();
		for (int i = 0; i < letters.length; i++) {
			letters[i] = String.valueOf(translate(letters[i]));	
		}
		

	}
}