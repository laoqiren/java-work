package com.network;
import java.util.*;
public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String key,email;
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入用户id");
		id = scan.nextInt();
		System.out.print("请输入用户密码");
		key = scan.next();
		scan.nextLine();
		System.out.println("请输入用户邮箱");
		email = scan.nextLine();
		netUser user = new netUser(id,key,email);
		System.out.println("您的用户id:"+user.getId()+"\n您的用户邮箱:"+user.getEmail());
	}

}
