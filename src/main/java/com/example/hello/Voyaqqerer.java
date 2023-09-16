package com.example.hello;

import lombok.Data;

@Data
public class Voyaqqerer {
	private String voyaqqererId;
	private String voyaqqererName;
	private String voyaqqererProfile;
	private int voyaqqererAge;
	private String voyaqqererProfileImageFileName;

	public String getVoyaqqererId() {
		return voyaqqererId;
	}

	public String getVoyaqqererName() {
		return voyaqqererName;
	}

	public String getVoyaqqererProfile() {
		return voyaqqererProfile;
	}

	public int getVoyaqqererAge() {
		return voyaqqererAge;
	}

	public void setVoyaqqererId(String id) {
		this.voyaqqererId = id;
	}
	public void setVoyaqqererName(String name) {
		this.voyaqqererName = name;
	}
	public void setVoyaqqererProfile(String profile) {
		this.voyaqqererProfile = profile;
	}
	public void setVoyaqqererAge(int age) {
		this.voyaqqererAge = age;
	}

	public void setVoyaqqererProfileImageFileName(String voyaqqererProfileImageFileName) {
		this.voyaqqererProfileImageFileName = voyaqqererProfileImageFileName;
		
	}
}
