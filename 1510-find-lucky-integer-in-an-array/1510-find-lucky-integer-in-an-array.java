class Solution {
    public static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int luckyInteger = -1;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                luckyInteger = Math.max(luckyInteger, key);
            }
        }
        return luckyInteger;
    }
}