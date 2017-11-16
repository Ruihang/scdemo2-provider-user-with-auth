package top.ruix.scdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Scdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Scdemo2Application.class, args);
	}
}
