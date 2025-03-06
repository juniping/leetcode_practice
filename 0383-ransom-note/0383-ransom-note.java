class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        int cnt =  ransomNote.length();

        for(int i=0; i<magazine.length(); i++){
            char m = magazine.charAt(i);
            if(map.containsKey(m)){
                int num = map.get(m);
                num++;
                map.replace(m, num);
            }else{
                map.put(m, 1);
            }
        }

        for(int i=0; cnt>0; i++){
            char c = ransomNote.charAt(i);
            if(map.containsKey(c)){ //map에 문자가 있는지 체크
                int num = map.get(c);
                num--;
                cnt--;
                if(num<=0){ //다 썼으면 map에서 문자 제거
                    map.remove(c);
                }else{ // 남아있으면 줄어든 갯수 업데이트
                    map.replace(c, num);
                }
            }else{ //map에 글자 없으면 바로 실패
                return false;
            }
        }

        // 아직 노트에 남은 글자가 있는 경우
        if(cnt>0) return false;

        return true;
    }
}


/**

check the string from magazine
which method will be available....

.equals 사용 ?





 */
