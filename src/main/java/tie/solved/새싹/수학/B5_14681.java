package tie.solved.새싹.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_14681 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        int result = getQuadrant(x, y);
        System.out.println(result);
    }

    private static int getQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

}