package com.dyd.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 * ʹ��Preparestatementʵ�ֶ����ݵĲ�ѯ����
 * 
 * @author caowanhe
 * @date 2017��3��30�� ����2:26:55
 */
public class PrepareStatementDemo1 {
	// ����MySQL�����ݿ���������
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	// ����MySQL���ݿ�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/mldn";
	// MySQL���ݿ�������û���
	public static final String DBUSER = "root";
	// MySQL���ݿ����������
	public static final String DBPASS = "mysql";

	public static void main(String args[]) throws Exception { // ���е��쳣�׳�
		Connection conn = null; // ���ݿ�����
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Class.forName(DBDRIVER); // ������������
		String sql = "select id,name,password,age,sex,birthday from admin_user";
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery(); // ִ�����ݿ���²���
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String password = rs.getString("password");
			String age = rs.getString("age");
			String sex = rs.getString("sex");
			Date d = rs.getDate("birthday");
			System.out.println(
					"��ţ�" + id + ";����:" + name + ",���룺" + password + ",���䣺" + age + ",�Ա�" + sex + ",�������ڣ�" + d);
			System.out.println("====================");
			System.out.println("=================");
		}
		rs.close();
		pstmt.close(); // �رղ���
		conn.close(); // ���ݿ�ر�
	}
};
