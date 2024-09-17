class Solution {
    private static final String[] KEYPAD = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }
    private void backtrack(List<String> result, StringBuilder currentCombination, String digits, int index) {
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }
        char currentDigit = digits.charAt(index);
        String letters = KEYPAD[currentDigit - '0'];
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);
            backtrack(result, currentCombination, digits, index + 1);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }
}