package com.dyd.demo.jdbc;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.Statement ;
public class UpdateDemo{
	// ����MySQL�����ݿ���������
	public static final String DBDRIVER = "com.mysql.jdbc.Driver" ;
	// ����MySQL���ݿ�����ӵ�ַ
	public static final String DBURL = "jdbc:mysql://localhost:3306/mldn" ;
	// MySQL���ݿ�������û���
	public static final String DBUSER = "root" ;
	// MySQL���ݿ����������
	public static final String DBPASS = "mysql" ;
	public static void main(String args[]) throws Exception {	// ���е��쳣�׳�
		Connection conn = null ;		// ���ݿ�����
		Statement stmt = null ;			// ���ݿ����
		int id = 2 ;
		Class.forName(DBDRIVER) ;	// ������������
		String name = "�" ;			// ����
		String password = "mldn"	;	// ����
		int age = 25 ;		// ����
		String sex = "��" ;	 // �Ա�
		String birthday = "2001-09-13" ;
		String sql = "UPDATE user SET name='"+name+"',password='"
			+password+"' , age=" + age + ",sex='"+sex+"',birthday='"
			+birthday+"' WHERE id="+id  ;
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		stmt = conn.createStatement() ;	// ʵ����Statement����
		stmt.executeUpdate(sql) ;		// ִ�����ݿ���²���
		stmt.close() ;					// �رղ���
		conn.close() ;			// ���ݿ�ر�
	}
};

