package es.cfuentes.code.test.palindrome;

/**
 * Palindrome checker
 *
 */
public class PalindromeChecker {
	
    public static boolean check (String sentence) {
    
    	// Check for a null imput
    	if(sentence == null || sentence.length() == 0)
    		return false;
    	
    	// normalize input string
    	String normSentence = sentence.replace(" ", "").toLowerCase();
    	
    	// iterate from both sides of the sentence checking
    	for(int i = 0; i < normSentence.length() / 2 ; i++)
    		if(normSentence.charAt(i) != normSentence.charAt(normSentence.length() - 1 - i))
    			return false;
    	
    	return true;
    }
}
