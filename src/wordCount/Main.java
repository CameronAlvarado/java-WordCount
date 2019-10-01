package wordCount;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String unText2 = Words.unText.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
		String[] words = unText2.split(" +");

		// *** prints Array ***
		// for(int i=0; i < words.length; i++){
		// 	System.out.println(words[i]);
		// }

		// *** Convert Array --> ArrayList ***
		ArrayList<String> wordsArrayList = new ArrayList<String>();
		wordsArrayList.addAll(Arrays.asList(words));

		// *** prints ArrayList ***
		// for (String w : wordsArrayList)
		// { //      ^------------|
		// 	System.out.println(w);
		// }

		HashMap<String, Integer> wordsHashMap = new HashMap<String, Integer>();

		// *** Convert ArrayList --> HashMap ***
		// int hashcount = 0;
		for (String w : wordsArrayList)
		{
			if (!wordsHashMap.containsKey(w))
			{
				wordsHashMap.put(w, 1);
			}
			else
			{
				wordsHashMap.put(w, wordsHashMap.get(w) + 1);
			}
			// put = if key does not exist, add it to the hashmap
			// 		 if key does exist, replace 
			// wordsHashMap.put(hashcount, w);
			// hashcount++;
		}

		// System.out.println(wordsHashMap.size());

		// *** prints HashMap with keys ***
		for (String st : wordsHashMap.keySet())
		{
			System.out.println("word: " + st + " occurances: " + wordsHashMap.get(st));
		}

		// for(int i=0; i < words.length; i++){
		// 	System.out.println(words[i]);
		// }

		// HashMap<Integer, String>
	}
}