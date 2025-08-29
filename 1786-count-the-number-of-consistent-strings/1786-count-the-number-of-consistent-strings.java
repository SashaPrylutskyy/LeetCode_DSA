class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int[] dictionary = new int[26];

        for (char c : allowed.toCharArray()) {
            dictionary[c - 'a']++;
        }

        for (String word : words) {
            count += checkWord(dictionary, word);
        }

        return count;
    }

    public static int checkWord(int[] arr, String word) {
        for (char c : word.toCharArray()) {
            if (arr[c - 'a'] == 0) {
                return 0;
            }
        }
        return 1;
    }
}