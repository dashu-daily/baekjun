package baekjun.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String text = br.readLine();
            int A = Integer.parseInt(text.split(" ")[0]);
            int B = Integer.parseInt(text.split(" ")[1]);
			bw.write(A + B + "\n");
		}
		bw.flush();
	}

}
