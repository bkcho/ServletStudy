package com.daodto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDao {
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "ppusari";
	private String upw = "oraclepw";

	public MemberDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemberDto> memberSelect(){
		
		ArrayList<MemberDto> dtos = new ArrayList<MemberDto>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM member");
			
			while (rs.next()) {
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String phone = rs.getString("phone");
				
				MemberDto dto = new MemberDto(id, pw, name, phone);
				dtos.add(dto);				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				rs.close();
				stmt.close();
				con.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dtos;
	}	 
}
