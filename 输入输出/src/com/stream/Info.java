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
		System.out.println("����������������");
		name = enter.next();
		System.out.println("�����������Ա�");
		sex = enter.next();
		System.out.println("��������������");
		year = enter.nextInt();
		System.out.println("���������İ༶");
		clas = enter.nextInt();
		finalString += " ������"+name+" �Ա�: " + sex + " ����: " + year + " �༶: " + clas;
		bw.write(finalString);
		bw.flush();
		last = br.readLine();
		System.out.println(last);
		
		System.out.println("\n��߻����ұߵ�ͬѧ�� 1.��ߣ�2.�ұ�");
		leftOrRight = enter.nextInt();
		System.out.println("������ta��������");
		name = enter.next();
		System.out.println("������ta���Ա�");
		sex = enter.next();
		System.out.println("������ta������");
		year = enter.nextInt();
		System.out.println("������ta�İ༶");
		clas = enter.nextInt();
		finalString = " ������"+name+" �Ա�: " + sex + " ����: " + year + " �༶: " + clas;
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