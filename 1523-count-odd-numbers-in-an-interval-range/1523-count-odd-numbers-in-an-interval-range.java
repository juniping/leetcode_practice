class Solution {
    public int countOdds(int low, int high) {

       int temp = high-low+1;

       if(low%2!=0 && high%2!=0){
        return (temp/2)+1;
       }else


        return temp/2; 

    }
}