package org.gokareless.ws;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

@EnableDiscoveryClient
@SpringBootApplication
public class SecondApp {

	public static void main(String[] args) {
		SpringApplication.run(SecondApp.class, args);
	}

}
