class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int k=part.length();
        for(int i=0;i<n;i++){
            sb.append(s.charAt(i));
            if(sb.length()>=k && sb.substring(sb.length()-k).equals(part)){
                sb.setLength(sb.length()-k);
            }
        }
        return sb.toString();
    }
}