package com.controler;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.MemberDto;

public interface Service {
	
	public ArrayList<MemberDto> execute(HttpServletRequest request, HttpServletResponse response);
}
