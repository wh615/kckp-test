package com.dyd.demo.collection;

/**
 * 增加用户信息的注释
 * @author  caowh
 * E-mail: 458584881@qq.com
 * @date 创建时间：2017年4月24日 下午10:30:31
 */
public class User implements Comparable<User> {

	private String name;
	private String address;
	private String nick;
	private int age;
	
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public User() {
		super();
	}
	public User(String name, String address, String nick,int age) {
		super();
		this.name = name;
		this.address = address;
		this.nick = nick;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + ", nick=" + nick + ",age="+age;
	}
	
	@Override
	public int compareTo(User o) {
		if(this.age>o.age){
			return 1;
		}else if(this.age<o.age){
			return -1;
		}else{
			return this.nick.compareTo(o.nick);
		}
	}
	
	
}
