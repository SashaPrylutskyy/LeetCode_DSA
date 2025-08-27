class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char el = s.charAt(i);
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            char el = t.charAt(j);
            if (!map.containsKey(el) || map.get(el) == 0) {
                return false;
            }
            map.put(el, map.get(el) - 1);
        }
        return true;
    }
}