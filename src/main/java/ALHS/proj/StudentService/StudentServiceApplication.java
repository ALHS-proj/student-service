package ALHS.proj.StudentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentServiceApplication {

	public static void main(String[] args) {

		int retries = 5;
		while (retries > 0) {
			try {
				SpringApplication.run(StudentServiceApplication.class, args);
				break;
			} catch (Exception e) {
				System.out.println("attempt failed. retrying...");
				retries--;
			}
		}
	}
}
