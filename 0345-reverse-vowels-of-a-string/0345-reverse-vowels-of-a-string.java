class Solution {
    public String reverseVowels(String s) {
        // 기존 코드 구조 유지하면서 수정
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
        map.put('A', 0);
        map.put('E', 0);
        map.put('I', 0);
        map.put('O', 0);
        map.put('U', 0);

        // 모음의 위치와 문자를 저장하는 맵
        Map<Integer, Character> vowelPositions = new HashMap<>();
        
        // 모음들을 따로 저장할 리스트
        List<Character> vowels = new ArrayList<>();

        int index = 0;
        for(Character c : s.toCharArray()){
            if(map.containsKey(c)){
                vowelPositions.put(index, c);  // 모음의 원래 위치 저장
                vowels.add(c);  // 모음 문자들을 순서대로 저장
            }
            index++;  // 인덱스 증가 (기존 코드에서 누락된 부분)
        }
        
        // 모음 리스트를 뒤집기
        Collections.reverse(vowels);
        
        // 결과 문자열 구성
        char[] result = s.toCharArray();
        int vowelIndex = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(vowelPositions.containsKey(i)){
                result[i] = vowels.get(vowelIndex++);
            }
        }
        
        return new String(result);
    }
}