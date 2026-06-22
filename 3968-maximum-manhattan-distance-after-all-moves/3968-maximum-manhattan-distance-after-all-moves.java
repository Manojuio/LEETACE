class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0,k=0;
        for(char c:moves.toCharArray()){
            if(c=='U') y++;
            else if(c=='D') y--;
            else if(c=='R')x++;
            else if(c=='L') x--;
            else k++;
        }
        return Math.abs(x)+Math.abs(y)+k;
    }
}