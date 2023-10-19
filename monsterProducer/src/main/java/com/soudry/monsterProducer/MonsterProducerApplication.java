package com.soudry.monsterProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient

public class MonsterProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonsterProducerApplication.class, args);
	}

}
