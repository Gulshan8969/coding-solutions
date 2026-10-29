class Solution {
    public void twoDimensional(ArrayList<ArrayList<Integer>> mat) {
        StringBuilder sb = new StringBuilder();
        for (ArrayList<Integer> row : mat) {
            for (int j = 0; j < row.size(); j++) {
                if (j > 0) sb.append(' ');
                sb.append(row.get(j));
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}