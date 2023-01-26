package com.nareshit.raghu.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Employee {
	
	private Integer id;
	private String name;
	private Integer sal;
	private String pass;
	private String empGen;
	private  String empDept;
	private String empAddress;
	private String empDoj;
}
