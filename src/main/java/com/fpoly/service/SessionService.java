package com.fpoly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class SessionService {
	@Autowired
	HttpSession session;
	
	public String get(String name, String defaultValue) {
		String param = (String) session.getAttribute(name);
		if(param != null) {
			return param;
		}
		return defaultValue;
	}
	/**
	* Thay đổi hoặc tạo mới attribute trong session
	* @param name tên attribute
	* @param value giá trị attribute
	*/
	public void set(String name, Object value) {
		session.setAttribute(name, value);
	}
	/**
	* Xóa attribute trong session
	* @param name tên attribute cần xóa
	*/
	public void remove(String name) {
		session.removeAttribute(name);
	}
}
