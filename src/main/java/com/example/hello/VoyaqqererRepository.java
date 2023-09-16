package com.example.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VoyaqqererRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Map<String,Object>findById(String id) {

		//SELECT文
		String query = "SELECT * "
				+ "FROM voyaqqerer "
				+ "WHERE id=?";

		//検索実行
		Map<String, Object>voyaqqerer = jdbcTemplate.queryForMap(query,id);

		return voyaqqerer;
	}
}
