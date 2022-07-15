package com.example.terminsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.terminsurance.data.UserBean;
import com.example.terminsurance.service.UserService;


  
@RestController
public class UserController {
	
		@Autowired
		UserService user;

		@GetMapping(value= "/user/userid/{UserId}")

		public List<UserBean> viewUserByID(@PathVariable("UserId")int UserId)
		{ 

			System.out.println("Fetched Successfully");
			return user.viewUserById(UserId);
		}
 
 
			@GetMapping(value= "/user/name/{name}")

			public List<UserBean> viewUserByName(@PathVariable("name")String name)
			{ 

				System.out.println("Fetched Successfully");
				return user.viewUserByName(name);
 

			}
			
			//Add User Details
		   	  
	   		@PostMapping(value= "/user/adduser")
	   	    public String addUser(@RequestBody UserBean userbean)
	   	  {
	   			
	   			user.addUser(userbean);
	   			return "Created successfully";
	   	   }


}
