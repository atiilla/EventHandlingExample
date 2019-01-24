package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import interfaces.StudentInterface;
import model.StudentRegisterEvent;

@Configuration
@ComponentScan(basePackages = "model")
public class AppConfig {
	private String name;
	private String email;
	private String schoolName;
	@Bean
	public StudentRegisterEvent Elli0t() {
		return new StudentRegisterEvent("Elli0t", "elli0t@robot.com", "Intecbrussel");
	}

	@Bean
	public StudentRegisterEvent StudentInfo() {
		return new StudentRegisterEvent(name, email, schoolName);
	}
	
	@Bean
	public StudentRegisterEvent MrRobot() {
		return new StudentRegisterEvent("MrRobot", "MrRobot@robot.com", "Intecbrussel");
	}

	@Bean
	public StudentRegisterEvent PhiberOptik() {
		return new StudentRegisterEvent("PhiberOptik", "PhiberOptik@robot.com", "Intecbrussel");
	}

	

}
