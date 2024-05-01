package tie.solved.Bronze3.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class B3_10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers;

        StringTokenizer st = new StringTokenizer(br.readLine());
        numbers = IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken())).toArray();

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        System.out.print(min + " " + max);
    }

}