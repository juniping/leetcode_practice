class Solution {
    public int compress(char[] chars) {
        char prev = chars[0];
        int count = 1;
        int write = 0;

        for(int i=1; i<chars.length; i++){
            if(chars[i]==prev){
                count++;
            }else{
                chars[write++] = prev;

                if(count>1){
                    for(char c: String.valueOf(count).toCharArray()){
                        chars[write++] = c;
                    }
                }

                count = 1;
                prev = chars[i];
            }
        }

        // 마지막 그룹 처리
        chars[write++] = prev;
        if(count>1){
                    for(char c: String.valueOf(count).toCharArray()){
                        chars[write++] = c;
                    }
        }

        return write;

    }
}