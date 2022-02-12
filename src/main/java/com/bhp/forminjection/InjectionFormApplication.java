package com.bhp.forminjection;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class InjectionFormApplication /*implements CommandLineRunner */{
/*
	@Autowired
	private JdbcTemplate jdbcTemplate;
	*/
	public static void main(String[] args) {
		SpringApplication.run(InjectionFormApplication.class, args);
	}
/*
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM customer";
		List<Customer> customers = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Customer.class));
		
		customers.forEach(System.out :: println);
	}
*/
}
