package tie.solved.Bronze5.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B5_9086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        String[] name = new String[t];
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            name[i] = str.charAt(0) + str.substring(str.length() - 1);
        }

        br.close();
        Arrays.stream(name, 0, t).forEach(System.out::println);
    }
}