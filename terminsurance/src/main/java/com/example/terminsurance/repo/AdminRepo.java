package com.example.terminsurance.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.terminsurance.data.AdminBean;

public interface AdminRepo extends JpaRepository<AdminBean,String> {

	/*List<AdminBean> findByUserId(int UserId);

	List<AdminBean> findByName(String name);*/

}
