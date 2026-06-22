class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n= nums.length;
        long[] ps = new long[n+1];
        ps[0]=0;
        for(int i=1;i<=n;i++){
            ps[i]=ps[i-1]+nums[i-1];
        }
        long ans = 0;
        for(int l=0;l<n;l++){
            for(int r=l;r<n;r++){
                long s = ps[r+1]-ps[l];
                if(ld(s)==x &&
                  fd(s)==x){
                    ans++;
                  }
            }
        }
        return (int)ans;
            
    }
    private int fd(long n){
        n= Math.abs(n);
        while(n>=10){
            n/=10;
        }
        return (int)n;
    }
    private int ld(long n){
        n= Math.abs(n);
        return (int)(n%10);
    }
    
}