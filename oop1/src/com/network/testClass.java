package com.network;
import java.util.*;
public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String key,email;
		Scanner scan = new Scanner(System.in);
		System.out.print("�������û�id");
		id = scan.nextInt();
		System.out.print("�������û�����");
		key = scan.next();
		System.out.print("�������û�����");
		email = scan.next();
		netUser user = new netUser(id,key,email);
		System.out.println("�����û�id:"+user.getId()+"\n�����û�����:"+user.getEmail());
	}

}
