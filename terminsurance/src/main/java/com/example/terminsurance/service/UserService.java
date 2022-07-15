package com.example.terminsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.terminsurance.repo.*;
import com.example.terminsurance.data.UserBean;

@Service
public class UserService {

	@Autowired
	private UserRepo userrepo;
	
	//User Methods
	//View By userID
	public List<UserBean> viewUserById(int UserId) {

		return (List<UserBean>) userrepo.findByUserId(UserId);

	}
	
	//View By name
		public List<UserBean> viewUserByName(String name) {

			return (List<UserBean>) userrepo.findByName(name);

		}
	//Add User
		
		public UserBean addUser(UserBean userbean) {

			return  userrepo.save(userbean);
		}
}
