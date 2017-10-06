package pf.net.api.zipcodews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ZipcodeWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipcodeWsApplication.class, args);
	}
}
