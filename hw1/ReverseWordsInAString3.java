class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] arr = s.split(" ");
        for (String word : arr) {
            sb.append(new StringBuilder(word).reverse());
            sb.append(" ");
        }
        return sb.toString().substring(0, s.length());
    }
}