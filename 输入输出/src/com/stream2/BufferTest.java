package com.stream2;

import java.io.*;

public class BufferTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("Test6_1.txt");
		BufferedReader br = new BufferedReader(fr);
		LineNumberReader lr = new LineNumberReader(br);
		
		FileWriter fw = new FileWriter("Test6_2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String line;
		String finalLine;
		
		while((line = lr.readLine())!=null){
			finalLine = lr.getLineNumber()+":"+line;
			System.out.println(finalLine);
			bw.write(finalLine);
			bw.newLine();
		}
		bw.flush();
		
		
	}

}
