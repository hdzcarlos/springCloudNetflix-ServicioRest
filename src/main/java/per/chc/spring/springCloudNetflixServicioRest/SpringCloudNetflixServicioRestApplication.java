package per.chc.spring.springCloudNetflixServicioRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudNetflixServicioRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixServicioRestApplication.class, args);
	}
}
