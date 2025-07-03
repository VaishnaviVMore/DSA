class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            int len=s.length();
        
        if(len%2!=0){
            continue;
        }
        int mid=len/2;
        int sum=0;int sum1=0;
        for(int j=0;j<mid;j++){
            sum+=s.charAt(j)-'0';
        }
        for(int k=mid;k<len;k++){
            sum1+=s.charAt(k)-'0';
        }
        if(sum==sum1){
            count++;
        }
    }
    return count;
    }
}