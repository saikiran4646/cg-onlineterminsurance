package com.example.terminsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.terminsurance.repo.*;
import com.example.terminsurance.data.AdminBean;

@Service

public class AdminService {
	

		@Autowired
		private AdminRepo adminrepo;
		
		
		//Add User
			
			public AdminBean addUser(AdminBean adminbean) {

				return  adminrepo.save(adminbean);
			}
	}


