package com.example.domain.user.model;

import java.util.Date;

import lombok.Data;

@Data
public class MUser {
	private String userId;
	private String password;
	private String userName;
	private Date birthday;
	private String profile;
	private Integer age;
	private Integer gender;
	private Integer regionId;
	private String profileImageFileName;
	private String role;
}
