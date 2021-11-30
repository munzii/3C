import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class S2309 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = 9;
		int[] arr = new int[n];
		int sum=0;
		boolean check =false;
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum+= arr[i];
		}
		
		for(int i=0; i<n; i++) {
			if(check) break;
			for(int j=0; j<n; j++) {
				if(i==j) continue;
				if(sum-arr[j]-arr[i]==100) {
					arr[i]=0;
					arr[j]=0;
					check=true;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			if(arr[i]!=0)
				bw.write(String.valueOf(arr[i])+"\n");
		}
		br.close();
		bw.flush();
		bw.close();

	}

}