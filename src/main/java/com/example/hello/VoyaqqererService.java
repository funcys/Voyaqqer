package com.example.hello;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoyaqqererService {

	@Autowired
	private VoyaqqererRepository repository;

	/* ボヤッカラーを1人取得する */

	public Voyaqqerer getVoyaqqerer(String id) {
		//検索
		Map<String,Object>map = repository.findById(id);

		//Mapから値を取得
		String voyaqqererId = (String)map.get("id");
		String voyaqqererName = (String)map.get("name");
		String voyaqqererProfile = (String)map.get("profile");
		String voyaqqererProfileImageFileName = (String)map.get("profile_image_file_name");
		//int voyaqqererAge = (Integer)map.get("age");
		BigDecimal age = (BigDecimal) map.get("age");
		int voyaqqererAge = age.intValue();

		//Voyaqqererクラスに値をセット
		Voyaqqerer voyaqqerer = new Voyaqqerer();

		voyaqqerer.setVoyaqqererId(voyaqqererId);
		voyaqqerer.setVoyaqqererName(voyaqqererName);
		voyaqqerer.setVoyaqqererProfile(voyaqqererProfile);
		voyaqqerer.setVoyaqqererAge(voyaqqererAge);
		voyaqqerer.setVoyaqqererProfileImageFileName(voyaqqererProfileImageFileName);
		

		return voyaqqerer;
	}
}