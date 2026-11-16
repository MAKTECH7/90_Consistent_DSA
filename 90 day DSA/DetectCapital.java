class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for(int i = 0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
            if(count==word.length()){
                return true;
            }
        }
        count = 0;
        for(int i = 0; i<word.length(); i++){
            if(Character.isLowerCase(word.charAt(i))){
                count++;
            }
            if(count==word.length()){
                return true;
            }
        }

        boolean flag = false;
        if(Character.isUpperCase(word.charAt(0))){
            flag = true;
        }

        for(int i = 1; i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                continue;
            }else{
                flag=false;
            }
        }


        return flag;
       
    }
}
