import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {        
        // 정렬해서
        // i랑 i+1을 비교해서
        // i+1의 접두에 i가 있는지를 체크
        
        Arrays.sort(phone_book);
        
        for(int i=0; i<phone_book.length-1; i++){
            for(int j=0; j<phone_book[i].length(); j++){
                if(phone_book[i].charAt(j) != phone_book[i+1].charAt(j)){
                    break;
                }else if(j==phone_book[i].length()-1){ //끝까지 다 왔으면
                    return false;
                }
            }
        }
        
        return true;        
    }
}
