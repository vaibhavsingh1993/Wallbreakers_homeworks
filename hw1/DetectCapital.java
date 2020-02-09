class Solution {
    public boolean detectCapitalUse(String word) {
        return checkAllCapitals(word) || checkFirstCapital(word) || checkNoneCapitals(word);
    }

    private boolean checkAllCapitals(String word) {
        return word.toUpperCase().equals(word);
    }

    private boolean checkFirstCapital(String word) {
        return word.substring(1).toLowerCase().equals(word.substring(1));
    }

    private boolean checkNoneCapitals(String word) {
        return word.toLowerCase().equals(word);
    }
}