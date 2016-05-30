package com.network;
class netUser {
	private int id;
	private String key;
	private String email;
	public netUser(int id,String key,String email){
		this.id = id;
		this.key = key;
		if(email.length() == 0){
			this.email = id + "@hope.com";
		} else {
			this.email = email;
		}
	}
	public int getId(){
		return this.id;
	}
	public String getEmail(){
		return this.email;
	}
}
