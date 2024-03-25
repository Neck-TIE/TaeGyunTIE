package tie.solved.B4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_1264 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine().toLowerCase();

            if (str.equals("#")) {
                break;
            }

            int answer = getNumberOfVowels(str);

            System.out.println(answer);
        }
    }

    private static int getNumberOfVowels(String str) {
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                answer++;
            }
        }
        
        return answer;
    }

}