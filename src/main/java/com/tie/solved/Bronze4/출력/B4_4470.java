package tie.solved.Bronze4.출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_4470 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            String str = br.readLine();
            System.out.println(i + ". " + str);
        }
    }

}