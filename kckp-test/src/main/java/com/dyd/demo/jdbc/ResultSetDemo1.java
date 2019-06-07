package com.dyd.demo.jdbc;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.ResultSet;
import java.sql.Statement ;
import java.util.Date;

public class ResultSetDemo1{
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
		Statement pstmt=null;
		ResultSet rs=null;
		Class.forName(DBDRIVER) ;	// ������������
		String sql = "select id,name,password,age,sex,birthday from admin_user";
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt=conn.createStatement();
		rs=pstmt.executeQuery(sql);	// ִ�����ݿ���²���
		while(rs.next()){
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String password=rs.getString("password");
			String age=rs.getString("age");
			String sex=rs.getString("sex");
			Date d=rs.getDate("birthday");
			System.out.println("��ţ�"+id+";����:"+name+",���룺"+password+",���䣺"+age+",�Ա�"+sex+",�������ڣ�"+d);
		    System.out.println("====================");
		}
		rs.close();
		pstmt.close() ;					// �رղ���
		conn.close() ;			// ���ݿ�ر�
	}
};

