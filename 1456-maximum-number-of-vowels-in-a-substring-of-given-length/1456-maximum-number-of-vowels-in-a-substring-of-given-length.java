class Solution {
    public int maxVowels(String s, int k) {

        Set<Character> vowels = new HashSet<>(
            Arrays.asList('a','e','i','o','u')
        );

        int index = 0;
        int max = 0;
        int count = 0;

        for (int i = 0; i < k && i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) count++;
        }
        max = count;


        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) count--;
            if (vowels.contains(s.charAt(i)))     count++;
            max = Math.max(max, count);
        }
        return max;
    }
}