package com.dyd.demo.jdbc;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.Statement ;
public class InsertDemo01{
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
		Class.forName(DBDRIVER) ;	// ������������
		String sql = "INSERT INTO user(id,name,password,age,sex,birthday) "+
			" VALUES ('000001','���˻�','www.mldn.cn',30,'��','2008-08-27')" ;
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		stmt = conn.createStatement() ;	// ʵ����Statement����
		stmt.executeUpdate(sql) ;		// ִ�����ݿ���²���
		stmt.close() ;					// �رղ���
		conn.close() ;			// ���ݿ�ر�
	}
};

