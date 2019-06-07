package com.dyd.demo.jdbc;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




/**
 * ʹ��Preparestatementʵ�ֶ����ݲ������
 * @author caowanhe
 * @date 2017��3��30�� ����2:26:55
 */
public class PrepareStatementDemo2{
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
		PreparedStatement pstmt=null;
		Class.forName(DBDRIVER) ;	// ������������
		String name="�����";
		String password="123456";
		int  age=20;
		String sex="��";
		String birthday="1998-06-15";
		String sql = "insert into admin_user(name,password,age,sex,birthday)" +"values(?,?,?,?,?)";
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,name);
		pstmt.setString(2,password);
		pstmt.setInt(3, age);
		pstmt.setString(4,sex);
		pstmt.setString(5, birthday);
		int rs=pstmt.executeUpdate();	// ִ�����ݿ���²���
		System.out.println("���µĲ�����¼�ǣ�"+rs);
		pstmt.close() ;					// �رղ���
		conn.close() ;			// ���ݿ�ر�
	}
};

