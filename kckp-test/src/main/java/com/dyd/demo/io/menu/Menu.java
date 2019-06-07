package com.dyd.demo.io.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	public Menu() throws IOException {
	while(true){
		this.show();
	}
	}

	private void show() throws IOException {
		
		System.out.println("购物商城系统");
		System.out.println("[1]、增加商品操作");
		System.out.println("[2]、删除商品操作");
		System.out.println("[3]、修改商品操作");
		System.out.println("[4]、查看商品操作");
		System.out.println("[0]、退出系统操作");
		
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String key=buf.readLine();
		
		switch (key) {
		case "1":
			MenuDemo.add();
			break;

		case "2":
			MenuDemo.delete();;
			break;

		case "3":
			MenuDemo.update();
			break;

		case "4":
			MenuDemo.query();
			break;
			
		case "0":
			System.exit(1);
			break;

		default:
			System.out.println("请输入正确的参数");
			break;
		}
		
	}

	public static void main(String[] args) throws Exception {
		new Menu();
	}
}
