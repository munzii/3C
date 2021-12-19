import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class T1149 {
	
	final static int R =0;
	final static int G =1;
	final static int B =2;
	static int[][] c;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		c = new int[n][3];
		dp = new int[n][3];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			c[i][R] = Integer.parseInt(st.nextToken());
			c[i][G] = Integer.parseInt(st.nextToken());
			c[i][B] = Integer.parseInt(st.nextToken());
		}
		
		dp[0][R] = c[0][R];
		dp[0][G] = c[0][G];
		dp[0][B] = c[0][B];
		
		bw.write(String.valueOf(Math.min(p(n-1, R), Math.min(p(n-1, G), p(n-1, B)))));
		
		br.close();
		bw.flush();
		bw.close();

	}
	
	static int p(int n, int color) {
		if(dp[n][color] == 0) {
			if(color==R) {
				dp[n][R] = Math.min(p(n-1, G), p(n-1, B)) + c[n][R];
			}
			else if(color==G) {
				dp[n][G] = Math.min(p(n-1, R), p(n-1, B)) + c[n][G];
			}
			else {
				dp[n][B] = Math.min(p(n-1, R), p(n-1, G)) + c[n][B];
			}
		}
		return dp[n][color];
	}

}