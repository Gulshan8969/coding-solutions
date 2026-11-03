class Solution {
    public String defangIPaddr(String address) {
       // return address.replace(".","[.]");
       StringBuilder result=new StringBuilder();
       for(char x:address.toCharArray()){
        if( x=='.'){
            result.append("[.]");
        }
        else{
            result.append(x);
        }
       }
       return result.toString();
    }
}