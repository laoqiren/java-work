package com.string;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Fly in the sky");
		String substr;
		int sum = 0;
		for(int i=0; i<str.length(); i++){
			if(str.indexOf('y',i)!=-1) {
				sum++;
				i = str.indexOf('y',i);
			} else {
				break;
			}
		}
		substr = str.substring(8,10);
		System.out.println("y���һ�γ����ڵ�"+(str.lastIndexOf('y')+1)
		+"���ַ�");
		System.out.println("�ַ�y�ܹ�������" + sum +"��");
		System.out.println("��ȡ�ַ���:" + substr);
	}

}
