package com.number;
import java.util.*;
public class number{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enter;
		int solve_enter[] = new int[4];
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ����λ����");
		enter = scan.nextInt();
		for(int i=0; i<3; i++){
			solve_enter[i] = enter % 10;
			enter /= 10;
		}
		System.out.println("�������Ϊ:");
		for(int i=0; i<3; i++){
			System.out.print(solve_enter[i]);
		}
	}

}
