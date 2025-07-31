class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        String bitcheck=Integer.toBinaryString(x^y);
        for(int i=0;i<bitcheck.length();i++){
            char ch=bitcheck.charAt(i);
            if(ch=='1'){
                count++;
            }
        }
        return count;
    }
}