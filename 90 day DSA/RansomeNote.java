
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Count frequency of characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            freq[ch - 'a']++;
        }

        // Check whether ransomNote can be constructed
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (freq[ch - 'a'] > 0) {
                freq[ch - 'a']--;
            } else {
                return false;
            }
        }

        return true;
    }
}
