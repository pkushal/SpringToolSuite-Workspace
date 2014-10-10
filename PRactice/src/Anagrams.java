import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		String[] strs = { "hos","boo","nay","deb","wow","bop","bob","brr","hey","rye","eve","elf","pup","bum","iva","lyx","yap","ugh","hem","rod","aha","nam","gap","yea","doc","pen","job","dis","max","oho","jed","lye","ram","pup","qua","ugh","mir","nap","deb","hog","let","gym","bye","lon","aft","eel","sol","jab"};
		Anagrams a = new Anagrams();
		a.anagrams(strs);
		for (String st : list) {
			System.out.print(st + " ");
		}
	}

	public List<String> anagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strs.length; i++) {
			sb.delete(0, sb.length());
			int[] ascii = new int[256];
			String temp = strs[i];
			/**
			 * To convert to ASCII and find the characters
			 */
			for (int j = 0; j < temp.length(); j++) {
				int val = temp.charAt(j);
				ascii[val] += 1;
			}

			/**
			 * To make the characters sorted and put it in the StringBuffer
			 */
			for (int k = 0; k < 256; k++) {
				if (ascii[k] > 0) {
					for (int l = 0; l < ascii[k]; l++) {
						sb.append((char) k);
					}
				}
			}
			String sorted = sb.toString();

			List<String> l = map.get(sorted);
			if (l == null) {
				map.put(sorted, l = new ArrayList<String>());
			}
			l.add(temp);
		}
		for (List<String> l : map.values()) {
			if (l.size() > 1)
				for (int i = 0; i < l.size(); i++) {
					list.add(l.get(i));
				}
		}

		return list;
	}
}
