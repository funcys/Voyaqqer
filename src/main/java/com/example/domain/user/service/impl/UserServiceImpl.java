package com.example.domain.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.repository.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;
	
	/* ユーザー登録 */
	@Override
	public void signup(MUser user) {
		user.setRegionId(1);	//リージョン
		user.setProfileImageFileName("test.jpg");	//リージョン
		user.setRole("ROLE_GENERAL");	//ロール
		mapper.insertOne(user);	
	}

	/** ユーザー取得 **/
	@Override
	public List<MUser> getUsers() {
		return mapper.findMany();
	}
}
