import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class T2446 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				bw.write(" ");
			}
			
			for(int k=0; k<(2*n-1)-(2*i); k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=1; j<(n-1)-i; j++) {
				bw.write(" ");
			}
			
			for(int k=0; k<3+(2*i); k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}