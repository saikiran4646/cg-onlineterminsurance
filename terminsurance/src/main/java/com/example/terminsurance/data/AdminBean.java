package com.example.terminsurance.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import com.sun.istack.NotNull;

@Entity
@Table(name="AdminBean")
@Data

public class AdminBean {
	
	@Id
    public String userId;

    @NotNull
    @Column(name = "customer_name", nullable = false)
    public String name;
     
    @Column(name = "nominee_name", columnDefinition = "TEXT")
    public String nominee ;
    
    @Column(name = "status", columnDefinition = "TEXT")
    public String status;
    
    @Column(name = "plan", columnDefinition = "TEXT")
    public String plan ;
    
    @Column(name = "premium/month")
    public int premium ;
    
    @Column(name = "Total_coverage")
    public int amount ;
    
    
    

}
