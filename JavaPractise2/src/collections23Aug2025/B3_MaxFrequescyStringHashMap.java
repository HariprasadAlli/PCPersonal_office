package collections23Aug2025;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B3_MaxFrequescyStringHashMap {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hari", "srikanth", "vishala", "hari", "srikanth", "hari");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> duplicate = new HashMap<String, Integer>();
		int count = 1;
		for(String str : list) {
			if(!map.containsKey(str)) {
				map.put(str, count);
			}
			else {
				map.put(str, (map.get(str))+1);
			}
		}
		for(String key : map.keySet()) {
			if(map.get(key) >1) {
				System.out.println(key+ " "+ map.get(key));
			}
		}
		int maxFreq=0;
		String maxRepeated = null;
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()>maxFreq) {
				maxFreq = entry.getValue();
				maxRepeated = entry.getKey();
			}
		}
		System.out.println(maxRepeated);

	}

}
