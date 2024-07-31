package tie.solved.새싹.출력;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class B5_7287 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("13");
        bw.newLine();
        bw.write("needle12s");
        bw.flush();
        bw.close();
    }

}