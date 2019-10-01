package wordCount;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String unText2 = Words.unText.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");
		String[] words = unText2.split(" +");

				// System.out.println(words);

		ArrayList<Words> wordsArrayList = new ArrayList<Words>();
		wordsArrayList.addAll(Arrays.asList(words));

		for (Words w : wordsArrayList)
		{ //      ^------------|
			System.out.println(w);
		}

		// HashMap<String, Words> wordsHashMap = new HashMap<String, Words>();

		// System.out.println(wordsHashMap.get());


		// for(int i=0; i < words.length; i++){
		// 	System.out.println(words[i]);
		// }

		// HashMap<Integer, String>
	}
}