class Solution {
    public boolean isPalindrome(int x) {
      int rev=0;
      if(x<0)return false;
      int temp=x;
      while(temp!=0){
        int rem=temp%10;
        rev=rev*10+rem;
        temp/=10;
      }
      if(x==rev){
        return true;
      }
      return false;
    }
}