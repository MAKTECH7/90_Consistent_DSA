
class Solution {
    public String reverseWords(String s) {
        char[] chArr = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= chArr.length; i++) {

            if (i == chArr.length || chArr[i] == ' ') {
                reverse(chArr, start, i - 1);
                start = i + 1;
            }
        }

        return new String(chArr);
    }

    void reverse(char[] chArr, int left, int right) {
        while (left < right) {
            char temp = chArr[left];
            chArr[left] = chArr[right];
            chArr[right] = temp;

            left++;
            right--;
        }
    }
}
