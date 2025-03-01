class Solution {
    public String makeGood(String s) {

        StringBuilder sb = new StringBuilder();
        int p = 0;

        for(int i=0; i<s.length(); i++){
            if(p>0 && Math.abs(sb.charAt(p-1)-s.charAt(i))==32){
                p--;
                sb.deleteCharAt(p);
            }else{
                sb.append(s.charAt(i));
                p++;
            }
        }

        return sb.toString();
        
    }
}
