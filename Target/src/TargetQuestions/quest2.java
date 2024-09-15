package TargetQuestions;
import java.util.Scanner;

public class quest2 {

	public static String verifyString(String phrase, String word) {
		int cont = 0;
		
		for(int i = 0; i < phrase.length(); i++) {
			if(phrase.substring(i, i + 1).equalsIgnoreCase(word)) {
				cont++;
			}
		}
		
		return cont == 0 ? "There are no occurrences of this letter" :
		       cont == 1 ? "There is only one occurrence of this letter" :
		       "Number of occurrences of the letter '" + word + "': " + cont;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "A";
		
		System.out.println("Write a sentence to be checked");
		String phrase = sc.nextLine();
		
		System.out.println(verifyString(phrase, word));
		
		sc.close();
	}

}
