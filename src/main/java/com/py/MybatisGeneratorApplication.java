package com.py;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MybatisGeneratorApplication {
//	@Autowired
//	private UserMapper userMapper;
//
//	@GetMapping("/findAll")
//	public List<User> findAll(){
//		return userMapper.selectAll();
//	}

	public static void main(String[] args) {
		SpringApplication.run(MybatisGeneratorApplication.class, args);
	}

}
