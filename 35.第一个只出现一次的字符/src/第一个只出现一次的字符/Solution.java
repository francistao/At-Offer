package 第一个只出现一次的字符;

import java.util.LinkedHashMap;

public class Solution {

	public Character FirstNotRepeatingChar(String str) {
		if(str == null){
			return null;
		}
		char[] strChar = str.toCharArray();
		LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();
		for(char item:strChar){
			if(hash.containsKey(item)){
				hash.put(item, hash.get(item)+1);
			}else{
				hash.put(item, 1);
			}
			for(char key:hash.keySet()){
				return key;
			}
		}
		return null;
    }
}
