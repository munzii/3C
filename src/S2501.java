import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class S2501 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				k--;
			}
			if(k==0) {
				bw.write(String.valueOf(i));
				break;
			}
		}
		if(k!=0) {
			bw.write(String.valueOf(0));
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}