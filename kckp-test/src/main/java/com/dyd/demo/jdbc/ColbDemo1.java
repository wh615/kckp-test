package com.dyd.demo.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement ;
import java.util.Date;


/**
 * ʹ��Preparestatementʵ�ֶ����ݵĲ�ѯ����
 * @author caowanhe
 * @date 2017��3��30�� ����2:26:55
 */
public class ColbDemo1{
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
		String name="�����";
		String sql = "insert into userclob (name,note) values(?,?)";
		
		Class.forName(DBDRIVER) ;	// ������������
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		pstmt=conn.prepareStatement(sql);
		File file=new File("d:"+File.separator+"test.txt");
		InputStream in=new FileInputStream(file);
		pstmt.setString(1,name);
		pstmt.setAsciiStream(2, in,file.length());
		pstmt.executeUpdate();
		pstmt.close() ;					// �رղ���
		conn.close() ;			// ���ݿ�ر�
	}
};

