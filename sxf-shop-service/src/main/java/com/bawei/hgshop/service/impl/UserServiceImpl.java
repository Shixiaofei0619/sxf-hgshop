package com.bawei.hgshop.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.bawei.hgshop.service.UserService;

/**
 * 
 * @author zhuzg
 *
 */
@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService{

	public boolean login(String userName, String passWord) {
		// TODO Auto-generated method stub
		return "admin".equals(userName) && "123456".equals(passWord);
		
	}

}
