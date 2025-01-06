class Solution {
    public String removeDuplicates(String s) {

        String[] arList = s.split("");
        ArrayList<String> ar = new ArrayList<>(Arrays.asList(arList));
        
        int j;
        while(true){
            j=0;
            for(int i=0; i < ar.size()-1; i++){
                if(ar.get(i).equals(ar.get(i+1))){
                    ar.remove(i);
                    ar.remove(i);
                    j++;
                }
            }
            if(j==0){
                break;
            }
        }
        return String.join("", ar);        
    }
}