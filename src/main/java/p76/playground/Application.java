package p76.playground;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import p76.playground.db.School;
import p76.playground.db.Student;
import p76.playground.rest.SchoolRepository;
import p76.playground.rest.StudentRepository;

@Log
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(StudentRepository repository, SchoolRepository schoolRepository) {
		return (args) -> {
			// save a couple of Students
			repository.save(new Student("Jack", "Bauer"));
			repository.save(new Student("Chloe", "O'Brian"));
			repository.save(new Student("Kim", "Bauer"));
			repository.save(new Student("David", "Palmer"));
			repository.save(new Student("Michelle", "Dessler"));

			schoolRepository.save(new School("Primary school"));
			schoolRepository.save(new School("Secondary school"));
			schoolRepository.save(new School("High school"));

			// fetch all Students
			log.info("Students found with findAll():");
			log.info("-------------------------------");
			for (Student Student : repository.findAll()) {
				log.info(Student.toString());
			}
			log.info("");

			// fetch an individual Student by ID
			Student Student = repository.findOne(1L);
			log.info("Student found with findOne(1L):");
			log.info("--------------------------------");
			log.info(Student.toString());
			log.info("");

			// fetch Students by last name
			log.info("Student found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			for (Student bauer : repository.findByLastName("Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");
		};
	}
}
