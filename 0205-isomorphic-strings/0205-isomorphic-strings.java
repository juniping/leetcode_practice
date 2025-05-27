class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);

            if(!map.containsKey(sc)&& !map.containsValue(tc)){
                map.put(sc, tc);
            }else{
                if(map.get(sc)!=tc){
                    return false;
                }
            }
        }
        return true;        
    }
}
