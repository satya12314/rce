package com.remote_code_executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
@EnableScheduling
@EnableWebSocketMessageBroker
@EnableTransactionManagement
@EntityScan(basePackages = "com.remote_code_executor.model")
@EnableJpaRepositories(basePackages = "com.remote_code_executor.repository")
public class RemoteCodeExecutorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteCodeExecutorApplication.class, args);
	}

}
