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
		boolean status2 = false;
		String SOS = "... --- ...";
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains(SOS)) {
				status = true;
			}
		}
 		
		System.out.println(status);
 		return status;
	}
	
	public static Object containsSOS() {
		return 0;
		
	}

	public static List<String> sortScores(List<Double> results) {

		return null;
	}
	
	
	public static Object sortDNA(List<String> unsortedSequences) {

		return null;
	}
	
	public static List<String> sortWords(List<String> words) {

		return null;
	}


	

	

}
