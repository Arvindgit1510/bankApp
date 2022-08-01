package code.microsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TranscationManagementDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TranscationManagementDemoApplication.class, args);
	}

}
