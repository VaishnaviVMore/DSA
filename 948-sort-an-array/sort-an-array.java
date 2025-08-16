class Solution {
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
    }
    public void merge(int nums[],int si,int ei){
        if(si>=ei) return;
        int mid=si+(ei-si)/2;
        merge(nums,si,mid);
        merge(nums,mid+1,ei);
        mergeSort(nums,si,mid,ei);
    }
    public void mergeSort(int[]nums,int si,int mid,int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        int[] ans=new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(nums[i]>nums[j]){
                ans[k]=nums[j];
                j++;k++;
            }
            else{
                ans[k]=nums[i];
                k++;i++;
            }
        }
        while(i<=mid){
            ans[k++]=nums[i++];
        }
        while(j<=ei){
            ans[k++]=nums[j++];
        }
        for(k=0,i=si;k<ans.length;k++,i++){
            nums[i]=ans[k];
        }
    }
}