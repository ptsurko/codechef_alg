package HOLES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < testCases; i++) {
        	String line = br.readLine();
        	int holeCount = 0;
        	for(int j = 0; j < line.length(); j++) {
        		char c = line.charAt(j);
        		if(c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'R' || c == 'Q') {
        			holeCount++;
        		} else if (c == 'B') {
        			holeCount += 2;
        		}
        	}
        	System.out.println(holeCount);
        }
	}
}
