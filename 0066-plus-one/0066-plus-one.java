class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
      for (int i=n-1; i>=0;i--) {
          if (digits[i]+1<10) {
          digits[i]++;
          return digits;
      } else {
           digits[i]=0;
         }
      }
      if (digits[0]==0) {
          int ar[]=new int[n + 1];
          ar[0]=1;
          return ar;
      }
      return digits;
    }
}