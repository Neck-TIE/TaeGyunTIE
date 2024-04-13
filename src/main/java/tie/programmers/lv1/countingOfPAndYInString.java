package tie.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countingOfPAndYInString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        countingOfPAndYInString t = new countingOfPAndYInString();

        boolean result = t.solution(str);
        System.out.println(result);
    }

    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter(c -> c == 'P').count() == s.chars().filter(c -> c == 'Y').count();
    }

}