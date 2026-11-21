import java.util.TreeMap;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int card : hand) {
            count.merge(card, 1, Integer::sum);
        }

        while (!count.isEmpty()) {
            int first = count.firstKey(); // smallest remaining card must start a group

            for (int card = first; card < first + groupSize; card++) {
                Integer c = count.get(card);
                if (c == null) return false; // missing a consecutive card

                if (c == 1) count.remove(card);
                else count.put(card, c - 1);
            }
        }
        return true;
    }
}