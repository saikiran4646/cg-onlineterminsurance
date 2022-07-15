package com.example.terminsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.terminsurance.data.AdminBean;
import com.example.terminsurance.service.AdminService;


  
@RestController

public class AdminController {
	
		
			@Autowired
			AdminService admin;

			/*@GetMapping(value= "/user/userid/{UserId}")

			public List<UserBean> viewUserByID(@PathVariable("UserId")int UserId)
			{ 

				System.out.println("Fetched Successfully");
				return admin.viewUserById(UserId);
			}
	 
	 
				@GetMapping(value= "/user/name/{name}")

				public List<UserBean> viewUserByName(@PathVariable("name")String name)
				{ 

					System.out.println("Fetched Successfully");
					return admin.viewUserByName(name);
	 

				}
				
				//Add User Details*/
			   	  
		   		@PostMapping(value= "/admin/adduser")
		   	    public String addUser(@RequestBody AdminBean adminbean)
		   	  {
		   			
		   			admin.addUser(adminbean);
		   			return "Created successfully";
		   	   }


	}


