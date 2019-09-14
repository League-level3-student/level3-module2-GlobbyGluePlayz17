package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int index = -1;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				index = i;
				break;
			}
		}
		
		System.out.println(index);
		return index;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int pearlCount = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).booleanValue() == true) {
				pearlCount++;
			}
		}
		
		System.out.println(pearlCount);
		return pearlCount;
	}

	public static double findTallest(List<Double> peeps) {
		double height = 0; 
		for (int i = 0; i < peeps.size(); i++) {
			if (height < peeps.get(i)) {
				height = peeps.get(i);
			} 
		}
		
		System.out.println(height);
		return height;
	}

	public static String findLongestWord(List<String> words) {
		int length = 0;
		int index = 0;
		for (int i = 0; i < words.size(); i++) {
			if (length < (int)words.get(i).length()) {
				length = (int)words.get(i).length();
				index = i;
			}
		}
		
		System.out.println(words.get(index));
		return words.get(index);
	}

	public static boolean containsSOS(List<String> message1) {
		boolean status = false;
		
		String SOS = "... --- ...";
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains(SOS)) {
				status = true;
			}
		}
 		
		System.out.println(status);
 		return status;
	}
	
	public static boolean containsSOS2(List<String> message2) {
		boolean status = false;
		
		String SOS = "... --- ...";
		for (int i = 0; i < message2.size(); i++) {
			if (message2.get(i).contains(SOS)) {
				status = true;
			}
		}
 		
		System.out.println(status);
 		return status;
	}

	public static List<Double> sortScores(List<Double> results) {
		boolean swap = true;
		
		while (swap) {
			swap = false;

			for (int i = 1; i < results.size(); i++) {
				if (results.get(i) < results.get(i-1)) {
					double sawp = results.get(i);
					results.set(i, results.get(i-1));
					results.set(i-1, sawp);
					swap = true;
				}
			}
		}
		
		System.out.println(results);
		return results;
	}
	
	
	public static List<String> sortDNA(List<String> unsortedSequences) {
		boolean swap = true;
		
		while (swap) {
			swap = false;
			
			for (int i = 1; i < unsortedSequences.size(); i++) {
				if (unsortedSequences.get(i).length() < unsortedSequences.get(i-1).length()) {
					String weug = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(i-1));
					unsortedSequences.set(i-1, weug);
					swap = true;
				}
			}
		}
		
		System.out.println(unsortedSequences);
		return unsortedSequences;
	}
	
	public static List<String> sortWords(List<String> words) {
		boolean wasp = true;
		
		while (wasp) {
			wasp = false;
			
			for (int i = 1; i < words.size(); i++) {
				if (words.get(i).compareTo(words.get(i-1)) < 0) {
					String uiop = words.get(i);
					words.set(i, words.get(i-1));
					words.set(i-1, uiop);
					wasp = true;
				}
			}
		}
		
		System.out.println(words);
		return words;
	}


	

	

}
