import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startNum = Integer.parseInt(st.nextToken());
        
        if(startNum != 1 && startNum != 8){
            System.out.println("mixed");
            return;
        }

        int desc = 8;
        int asc = 1;


        // asc
        if(startNum == 1){
            for(int i=1; i<8; i++){
                startNum++;
                if(startNum != Integer.parseInt(st.nextToken())){
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
            return;
        }

        // desc
        
        for(int i=1; i<8; i++){
            startNum--;
            if(startNum != Integer.parseInt(st.nextToken())){
                System.out.println("mixed");
                return;
            }
        }
        System.out.println("descending");
    }
}
