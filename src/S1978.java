import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class S1978 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int a =0;
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(arr[i]);
			int count=0;
			if(num==1) {
				continue;
			}
			else
				for(int j=1; j<=num; j++) {
					if(num%j==0) {
						count++;
					}
				}
			if(count==2) {
				a++;
			}
		}
		
		bw.write(String.valueOf(a));
		
		br.close();
		bw.flush();
		bw.close();

	}

}