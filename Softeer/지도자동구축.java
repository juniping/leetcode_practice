import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int side = 2;

        for(int i=0; i<n; i++){
            side = side + (side-1);
        }

        System.out.println(side*side);
    }
}
