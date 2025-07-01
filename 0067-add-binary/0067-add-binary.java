class Solution {
    int sum = 0, rem = 0;

    public String addBinary(String a, String b) {

        String s1 = "";
        int sub=0;
        if(a.length() > b.length() )
        {
            sub=a.length()-b.length();
            for(int i=0;i<sub;i++)
            {
                b="0"+b;
            }

        }
        if(a.length() < b.length())
        {
            sub=b.length()-a.length();
            for(int i=0;i<sub;i++)
            {
                a="0"+a;
            }
        }
        while (a.length() > 0 && b.length() > 0) {
            int c1 = (int) a.charAt(a.length() - 1) - 48;
            int c2 = (int) b.charAt(b.length() - 1) - 48;
            if (c1 + c2 + rem == 0) {
                sum = 0;
                rem = 0;
            } else if (c1 + c2 + rem == 1) {
                sum = 1;
                rem = 0;
            } else if (c1 + c2 + rem == 2) {
                sum = 0;
                rem = 1;
            } else {
                sum = 1;
                rem = 1;
            }
            s1 = sum + s1;
            a = a.substring(0, a.length() - 1);
            b = b.substring(0, b.length() - 1);
        }
        if (rem == 1)
            s1 = "1" + s1;
        return s1;

    }
}