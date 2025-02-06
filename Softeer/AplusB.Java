import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        
        for (int i=0; i<n; i++){
            st= new StringTokenizer(br.readLine());
            bw.write("Case #" + (i+1) + ": " + (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
            bw.newLine();
        }

        bw.flush();
    }
}
