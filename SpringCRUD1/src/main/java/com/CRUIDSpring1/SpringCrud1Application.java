package com.CRUIDSpring1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringCrud1Application implements CommandLineRunner {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCrud1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql ="select * from Student" ;
	  List<Student>student= jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
	student.forEach(System.out :: println);
	} 

}
