import java.util.*;
import java.io.*;

//*Program that reads Strings from the keyboard and adds them to a list. Afterwards it displays the words in reversed order on the console. */

public class WordsInReverse {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>(); //creates list of Strings
		BufferedReader readWords = new BufferedReader(new InputStreamReader(System.in)); //reads from keyboard
		
		for (int i = 0; i < 10; i++) { //adds 10 words from the keyboard to the list
			list.add(readWords.readLine());
		}
		
		for(int i = list.size()-1; i >= 0; i--) { //displays reversed order of list on screen
			System.out.println(list.get(i));
		}
	}
}
