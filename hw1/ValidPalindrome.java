class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        System.out.println(s);
        int first = 0, last = s.length() - 1;
        while (first < last) {
            if (s.charAt(first) != s.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}