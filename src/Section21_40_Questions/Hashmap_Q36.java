package Section21_40_Questions;

import java.util.HashMap;
import java.util.Map;

//Question: Input a hashmap. Count the keys which are not divisible by 4 and return.

/*  Def:     Maps are used for when you want to associate a key with a 
             value and Lists are an ordered collection. Map is an interface 
             in the Java Collection Framework and a HashMap is one implementation
             of the Map interface. HashMap are efficient for locating a value based
             on a key and inserting and deleting values based on a key.*/

public class Hashmap_Q36 {
	
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(12, 90);
		hm.put(35, 30);
		hm.put(33, 30);
		hm.put(56, 30);

		int sum = 0;
		int cont = 0;
		for (Map.Entry<Integer, Integer> me : hm.entrySet()) {
			int value = me.getValue();
			int key = me.getKey();
			if (key % 2 != 0) {
				sum = sum + value;
				cont++;
			}
			
		}
		int average = sum / cont;
		System.out.println(average);

	}

}

