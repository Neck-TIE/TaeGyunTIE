package tie.solved.Bronze3.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_1085 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int result = solution(x, y, w, h);
        System.out.println(result);
    }

    public static int solution(int x, int y, int w, int h) {
        int x_min = Math.min(x, w - x);
        int y_min = Math.min(y, h - y);

        return Math.min(x_min, y_min);
    }

}