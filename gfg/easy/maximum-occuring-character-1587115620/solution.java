class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int [] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int maxCount=0;
        int result='a';
        for(int i=0;i<26;i++){
            if(freq[i]>maxCount){
                maxCount=freq[i];
                result=(char)('a'+i);
            }
        }
        return (char)result;
    }
}