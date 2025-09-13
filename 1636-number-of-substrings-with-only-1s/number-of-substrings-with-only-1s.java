class Solution {
    public int numSub(String s) {
        int n=s.length();
        long mod=1000000007;
        long count=0;
        long ans=0;
        long sum=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                count++;
            }
            else{
               sum=(count*(count+1))/2;
               sum=sum%mod;
               ans+=sum % mod;
               count=0;
            }
        }
        sum=(count*(count+1))/2;
        sum=sum%mod;
        ans+=sum % mod;
        return (int)ans;
    }
}