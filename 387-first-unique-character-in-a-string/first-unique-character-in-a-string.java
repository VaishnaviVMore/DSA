class Solution {
    public int firstUniqChar(String s) {
       LinkedHashMap<Character,Integer>lm=new LinkedHashMap<>();
       int n=s.length();
       for(char c:s.toCharArray()){
        lm.put(c,lm.getOrDefault(c,0)+1);
       } 
       for(int i=0;i<s.length();i++){
        if(lm.get(s.charAt(i))==1){
            return i;
            //break;
        }
       }
       return -1;
    }
}