package com.student;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo[] students = new StudentInfo[3];
		String name;
		float cs,ms,es;
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++){
			System.out.println("������ѧ������");
			name = scan.next();
			System.out.println("���������ĳɼ�");
			cs = scan.nextFloat();
			System.out.println("��������ѧ�ɼ�");
			ms = scan.nextFloat();
			System.out.println("������Ӣ��ɼ�");
			es = scan.nextFloat();
			students[i] = new StudentInfo(name,cs,ms,es);
			students[i].average(name, cs, ms, es);
		}
		for(int i=0; i<3; i++){
			students[i].print();
		}

	}

}
