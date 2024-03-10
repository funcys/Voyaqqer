package com.example.domain.user.model;

import lombok.Data;

@Data
public class MUser {
	private String userId;
	private String password;
	private String userName;
	private String birthday;
	private String profile;
	private String age;
	private String gender;
	private String regionId;
	private String profileImageFileName;
	private String role;
}
