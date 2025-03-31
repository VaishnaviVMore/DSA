class Solution {
    public String reverseWords(String s) {
        // int n=s.length();
        String words[]=s.trim().split("\\s+");
        int n=words.length;
        StringBuilder Sb=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            Sb.append(words[i]);
            Sb.append(" ");
        }
        
        return Sb.toString().trim();
    }
}