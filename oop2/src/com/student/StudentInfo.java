package com.student;

class StudentInfo {
	private String name;
	private float cs;
	private float ms;
	private float es;
	private double average;
	public StudentInfo(String name,float cs,float ms,float es){
		this.name = name;
		this.cs = cs;
		this.ms = ms;
		this.es = es;
	}
	public double average(String name,float cs,float ms,float es){
		this.average = (cs + ms + es)/3.0;
		return this.average;
	}
	public void print(){
		System.out.println(this.name+"�����ĳɼ���:"+this.cs+",��ѧ�ɼ���:"+this.ms+",Ӣ��ɼ���:"+this.es
				+",ƽ������:"+this.average);
	}
}
