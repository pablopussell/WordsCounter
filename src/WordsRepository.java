import java.util.ArrayList;

public class WordsRepository {
	
	ArrayList<String> Words = new ArrayList<String>();
	ArrayList<String> words = new ArrayList<String>();
	
	public String[] pickRandom(int numberOfWordsToPick) {
		/*for (int i = 0; i < numberOfWordsToPick; i++) {
			words[i] = Words.get((int)(Math.random()*Words.size()));
		}
		return words;*/
		while (words.size()< numberOfWordsToPick) {
			if (!words.contains(arg0)) {
		}
	}
	
	public void add(String[] wordsToBeAdded) {
		for (int i=0; i<wordsToBeAdded.length; i++) {
		Words.add(wordsToBeAdded[i]);
		}
	}
	
	public void save() {
		
	}

}
