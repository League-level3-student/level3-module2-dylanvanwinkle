package _02_More_Algorithms;

import java.util.HashMap;

public class MorseCodeTranslater {
	HashMap<String,Character> letters = new HashMap<String,Character>();
public static void main(String[] args) {
	new MorseCodeTranslater().Runner();
}
public void setUp() {
	letters.put(".-", 'a');
	letters.put("-...", 'b');
	letters.put("-.-.", 'c');
	letters.put("-..", 'd');
	letters.put(".", 'e');
	letters.put("..-.", 'f');
	letters.put("--.", 'g');
	letters.put("....", 'h');
	letters.put("..", 'i');
	letters.put(".---", 'j');
	letters.put("-.-", 'k');
	letters.put(".-..", 'l');
	letters.put("--", 'm');
	letters.put("-.", 'n');
	letters.put("---", 'o');
	letters.put(".--.", 'p');
	letters.put("--.-", 'q');
	letters.put(".-.", 'r');
	letters.put("...", 's');
	letters.put("-", 't');
	letters.put("..-", 'u');
	letters.put("...-", 'v');
	letters.put(".--", 'w');
	letters.put("-..-", 'x');
	letters.put("-.--", 'y');
	letters.put("--..", 'z');
	
}
public void Runner() {
	setUp();
}
public String translate(String morseCode) {
	for (int i = 0; i < morseCode.length(); i++) {
		
	}
	return "";
}
}
