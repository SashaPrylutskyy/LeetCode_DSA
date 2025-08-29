class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        wordLoop: for (String word : words) {
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    continue wordLoop;
                }
            }
            count++;
        }

        return count;
    }
}