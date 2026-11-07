import java.util.*;

class Solution {
    public ArrayList<Integer> findEvenOccurrences(int[] arr) {
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() % 2 == 0) {
                res.add(e.getKey());
            }
        }

        if (res.isEmpty()) {
            res.add(-1);
        }
        return res;
    }
}