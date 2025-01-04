class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> m = new HashMap<>();

        m.put("I", 1);
        m.put("V", 5);
        m.put("X", 10);
        m.put("L", 50);
        m.put("C", 100);
        m.put("D", 500);
        m.put("M", 1000);

        int result =0;

        for(int i=0; i<= s.length()-1; i++){
            String s_fr = s.substring(i,i+1);

            if(i==s.length()-1){
                result += m.get(s_fr);
                break;
            }

            String s_b = s.substring(i+1, i+2);

            if(m.get(s_fr) >= m.get(s_b)){
                result += m.get(s_fr);
            }else if (m.get(s_fr) < m.get(s_b)){
                result += (m.get(s_b)-m.get(s_fr));
                i++;
            }
        }
        return result;
    }
}