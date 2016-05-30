package com.number;
import java.util.*;
public class number{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enter;
		int solve_enter[] = new int[4];
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个三位整数");
		enter = scan.nextInt();
		for(int i=0; i<3; i++){
			solve_enter[i] = enter % 10;
			enter /= 10;
		}
		System.out.println("倒序输出为:");
		for(int i=0; i<3; i++){
			System.out.print(solve_enter[i]);
		}
	}

}
