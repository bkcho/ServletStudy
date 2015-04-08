package com.controler;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controler.Service;
import com.login.MemberDao;
import com.login.MemberDto;

public class MembersAllService implements Service {
	
	public MembersAllService() {
		// TODO Auto-generated constructor stub
	} 
	
	@Override
	public ArrayList<MemberDto> execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao dao = MemberDao.getInstance();
		return dao.membersAll();
	}
}
