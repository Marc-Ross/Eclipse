package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
/*spring.datasource.url=jdbc:sqlserver://25.55.155.178:1433;databaseName=db_clientes
	spring.datasource.username=ebim
			spring.datasource.password=Viernes14
			spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
			spring.jpa.show-sql=true
			spring.jpa.database-platform=org.hibernate.dialect.SQLServer2012Dialect
			spring.jpa.hibernate.ddl-auto=create-drop
			logging.level.org.hibernate=debug*/
}
