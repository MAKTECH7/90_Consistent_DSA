class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        if(s.isEmpty()) return true;

        while(j<t.length() && i<s.length()){
            char ch = s.charAt(i);
            char ch2 = t.charAt(j);

            if(ch==ch2){
                i++;
                
            }
            
            j++;

        }

        
        return i==s.length();
    }
}
