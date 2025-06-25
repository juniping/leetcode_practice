class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length()==0){
            return true;
        }

        int p = 0;

        for(int i=0; i<t.length(); i++){
            if(p<s.length() && s.charAt(p) == t.charAt(i)){
                p++;
            }
        }

        if(p==s.length()){
            return true;
        }else{
            return false;
        }
    }
}

// pointer i가 s의 순서를 하나씩 가져오고

// t를 순회하면서 s[i]랑 같은걸 만나면 i++

// i가 s의 length를 다 순회하면 성공