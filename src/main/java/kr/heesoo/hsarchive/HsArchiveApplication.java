package kr.heesoo.hsarchive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HsArchiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsArchiveApplication.class, args);
	}

}
