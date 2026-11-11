class Solution {
    public String reverseVowels(String s) {
        
        int left = 0;
        int right = s.length() - 1;
        char[] chArr = s.toCharArray();

        while (left < right) {
            while (left < right && !isVowel(chArr[left])) {
                left++;
            }

            while (left < right && !isVowel(chArr[right])) {
                right--;
            }

            char temp = chArr[left];
            chArr[left] = chArr[right];
            chArr[right] = temp;
            left++;
            right--;
        }

        return new String(chArr);
    }

    boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}
