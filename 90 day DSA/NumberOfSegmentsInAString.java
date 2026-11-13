class Solution {
    public int countSegments(String s) {
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        String[] result = s.split("\\s+");

        return result.length;
    }
}
