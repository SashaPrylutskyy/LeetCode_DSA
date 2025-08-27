class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (char el : address.toCharArray()) {
            if (el == '.') {
                sb.append("[.]");
            } else {
                sb.append(el);
            }
        }
        return sb.toString();
    }
}