class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) { 
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<numOnes; i++){
            list.add(1);
        }

        for(int i=0; i<numZeros; i++){
            list.add(0);
        }
        
        for(int i=0; i<numNegOnes; i++){
            list.add(-1);
        }

        int result =0;
        for(int i=0; i<k; i++){
            result += list.get(i);
        }
        return result;
    }
}

