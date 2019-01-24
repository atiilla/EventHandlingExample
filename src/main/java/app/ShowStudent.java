package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import model.StudentRegisterEvent;


@EnableAspectJAutoProxy
public class ShowStudent {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentRegisterEvent smith = ctx.getBean("Elli0t",StudentRegisterEvent.class);
		
		smith.Take_a_break(30);
		smith.study();
		smith.getName();
		smith.ShowStudent();
		smith.Study();
		
		StudentRegisterEvent showStudent = ctx.getBean(StudentRegisterEvent.class, "Kevin Mitnick", "kevin@gmail.com","Harvard");
		showStudent.ShowStudent();
		
	}

}
