import java.util.ArrayList;

public class WordsRepository {
	
	ArrayList<String> Words = new ArrayList<String>();
	
	public String[] pickRandom(int numberOfWordsToPick) {
		String[] words = new String[numberOfWordsToPick];
		for (int i = 0; i < numberOfWordsToPick; i++) {
			words[i] = Words.get((int)(Math.random()*(Words.size())));
		}
		return words;
	}
	
	public void add(String[] wordsToBeAdded) {
		for (int i=0; i<wordsToBeAdded.length; i++) {
		Words.add(wordsToBeAdded[i]);
		}
	}
	
	public void save() {
		
	}

}
