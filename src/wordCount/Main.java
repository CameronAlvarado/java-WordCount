package wordCount;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String unText2 = Words.unText.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
		String[] words = unText2.split(" +");

		HashMap<String, Integer> wordsHashMap = new HashMap<>();

		// *** Convert ArrayList --> HashMap ***
		// int hashcount = 0;
		for (String w : words)
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
   
				// sort HashMap
		ArrayList<HashMap.Entry<String, Integer>> sortedMap = new ArrayList<>();
		sortedMap.addAll(wordsHashMap.entrySet());

		Collections.sort(sortedMap, new Comparator<HashMap.Entry<String, Integer>>()
		{
			public int compare(HashMap.Entry<String, Integer> o1, HashMap.Entry<String, Integer> o2)
			{
				return o2.getValue() - o1.getValue();
				// return o2.getValue().getAvgWeight() - o1.getValue().getAvgWeight();			
			}
		});

		int count = 0;

		for (HashMap.Entry<String, Integer> w : sortedMap)
		{
			if (count <= 49)
			{
				System.out.println("word: " + w.getKey() + " value: " + w.getValue());
				count++;
			}
		}

		// *** prints HashMap ***
		// int maxValueInMap=(Collections.max(wordsHashMap.values()));
		// for (String st : wordsHashMap.keySet())
		// {
		// 	if (wordsHashMap.get(st) == maxValueInMap)
		// 	{
		// 		System.out.println(st + " occurances: " + wordsHashMap.get(st));
		// 	}
		// }

		// for(int i=0; i < words.length; i++){
		// 	System.out.println(words[i]);
		// }

	}
}