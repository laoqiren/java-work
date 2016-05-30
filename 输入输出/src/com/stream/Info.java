package com.stream;
import java.io.*;
import java.util.*;
public class Info {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String name,sex;
		int year,clas;
		int leftOrRight;
		String finalString = "";
		String last;
		
		FileWriter fw = new FileWriter("info.txt",false);
		BufferedWriter bw = new BufferedWriter(fw);
		FileReader fr = new FileReader("info.txt");
		BufferedReader br = new BufferedReader(fr);
		Scanner enter = new Scanner(System.in);
		System.out.println("请输入您的姓名：");
		name = enter.next();
		System.out.println("请输入您的性别");
		sex = enter.next();
		System.out.println("请输入您的年龄");
		year = enter.nextInt();
		System.out.println("请输入您的班级");
		clas = enter.nextInt();
		finalString += " 姓名："+name+" 性别: " + sex + " 年龄: " + year + " 班级: " + clas;
		bw.write(finalString);
		bw.flush();
		last = br.readLine();
		System.out.println(last);
		
		System.out.println("\n左边还是右边的同学？ 1.左边，2.右边");
		leftOrRight = enter.nextInt();
		System.out.println("请输入ta的姓名：");
		name = enter.next();
		System.out.println("请输入ta的性别");
		sex = enter.next();
		System.out.println("请输入ta的年龄");
		year = enter.nextInt();
		System.out.println("请输入ta的班级");
		clas = enter.nextInt();
		finalString = " 姓名："+name+" 性别: " + sex + " 年龄: " + year + " 班级: " + clas;
		fw = new FileWriter("info.txt",false);
		bw = new BufferedWriter(fw);
		if(leftOrRight == 1){
			finalString += last;
		} else {
			finalString = last + finalString;
		}
		bw.write(finalString);
		bw.flush();
	}
}