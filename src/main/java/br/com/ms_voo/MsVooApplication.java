package br.com.ms_voo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsVooApplication {

	static void main(String[] args) {
		SpringApplication.run(MsVooApplication.class, args);
	}

}
