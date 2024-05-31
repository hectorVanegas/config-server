package com.co.dosman.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan({ "com.co.dosman.common.entity" })
@EnableDiscoveryClient
@EnableJpaRepositories({ "com.co.dosman.common.entity" })
@EntityScan({ "com.co.dosman.common.entity" }) 
@SpringBootApplication
public class MicroservicioCursosApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroservicioCursosApplication.class, args);
	}
}
