class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int i=0;i<res.length;i++){
            res[i]=-1;
        }
        for(int i=0;i<nums1.length;i++){
            boolean found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                   found=true;
                }
                else if(found && nums2[j]>nums1[i]){
                    res[i]=nums2[j];  
                    break;             
                }

                }  
            }
            return res;
        }
        
    }
