class Solution {
    public int minChanges(int n, int k) {
        if((n & k)!=k){
            return -1;
        }
        int count=0;
        String binary=Integer.toBinaryString(n^k);
    for(int i=0;i<binary.length();i++){
        char ch=binary.charAt(i);
        if(ch=='1'){
            count++;
        }
    }
    return count;
    }
}