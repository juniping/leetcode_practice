class Solution {
    public List<String> letterCombinations(String digits) {

        

        List<String> result = new ArrayList<>();

        if(digits.length()==0){
            return result;
        }

        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        bt(digits, map, result, 0, new StringBuilder());

        return result;
        
    }

    public void bt(String digits, Map<Character, String> map, List<String> result, int index, StringBuilder comb){
        if(index == digits.length()){
            // 종료
            result.add(comb.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));
        for(char letter : letters.toCharArray()){
            comb.append(letter);
            bt(digits, map, result, index+1, comb);
            comb.deleteCharAt(comb.length()-1);
        }


    }
}