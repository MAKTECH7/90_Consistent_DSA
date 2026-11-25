class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int j = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[j++] = current;

            if (count > 1) {
                String str = String.valueOf(count);

                for (char ch : str.toCharArray()) {
                    chars[j++] = ch;
                }
            }
        }

        return j;
    }
}
