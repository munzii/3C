import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class T1932 {
	
	static int[][] arr;
	static Integer[][] dp;
	static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		n= Integer.parseInt(br.readLine());
		arr= new int[n][n];
		dp = new Integer[n][n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<i+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			dp[n-1][i] = arr[n-1][i];
		}
		
		bw.write(String.valueOf(find(0,0)+"\n"));
		
		br.close();
		bw.flush();
		bw.close();

	}
	
	static int find(int depth, int idx) {
		if(depth == n-1) return dp[depth][idx];
		
		if(dp[depth][idx]==null) {
			dp[depth][idx] = Math.max(find(depth +1, idx), find(depth+1,idx+1))+arr[depth][idx];
		}
		return dp[depth][idx];
	}

}