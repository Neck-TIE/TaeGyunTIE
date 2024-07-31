package tie.solved.Bronze2.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().trim();

        if(s.equals("")) {
            System.out.println(0);
            return;
        }

        int len = s.split(" ").length;
        System.out.println(len);
    }

}