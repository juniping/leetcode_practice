class Solution {
    boolean isV[];
    int numOfRooms;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        numOfRooms = rooms.size();
        isV = new boolean[numOfRooms];

        dfs(0, rooms);

        for(boolean b: isV){
           if(!b){
            return false;
           } 
        }

        return true;

    }

    public void dfs(int i, List<List<Integer>> rooms){

        isV[i] = true;
        
        List<Integer> keys = rooms.get(i);
        int numOfKeys = keys.size();

        for(int j=0; j<numOfKeys; j++){
            int key = keys.get(j);
            if(!isV[key]){
                dfs(key ,rooms);
            }
        }
    }
}