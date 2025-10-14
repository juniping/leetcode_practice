class Solution {
    public boolean wordPattern(String pattern, String s) {
        char arr[] = pattern.toCharArray();
        String arrS[] = s.split(" ");

        if(arr.length!=arrS.length){
            return false;
        }

        Map<Character, String> map = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            if(map.containsKey(arr[i])){
                if(!map.get(arr[i]).equals(arrS[i])){
                    return false;
                }
            }else if(!map.containsValue(arrS[i])){
                map.put(arr[i], arrS[i]);
            }else{
                return false;
            }
        }
        return true;
    }
}
