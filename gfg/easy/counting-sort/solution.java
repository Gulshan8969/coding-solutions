class Solution {
    public static String countSort(String s) {
        // code here
        int [] count=new  int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        char [] result=new char [s.length()];
        int idx=0;
        for(int c=0;c<26;c++){
            while(count[c]-->0){
                result[idx++]=(char)('a'+c);
            }
        }
        return new String (result);
    }
    
}