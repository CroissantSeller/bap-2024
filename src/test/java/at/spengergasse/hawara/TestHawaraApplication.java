package at.spengergasse.hawara;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestHawaraApplication {

	public static void main(String[] args) {
		SpringApplication.from(HawaraApplication::main)
				.with(TestContainerConfiguration.class).run(args);
	}
}