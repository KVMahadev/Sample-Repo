package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Duplicate[] = { "amazon", "amazon", "meta", "fb" };

		Map<String, Integer> M1 = new HashMap<String, Integer>();
		for (String g : Duplicate) {
			Integer count = M1.get(g);
			if (count == null) {
				M1.put(g, 1);
			} else {
				M1.put(g, ++count);
			}
		}
		Set<Entry<String, Integer>> S1=M1.entrySet();
		for (Entry<String, Integer> entry : S1) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
