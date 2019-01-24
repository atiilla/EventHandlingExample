package Events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import model.StudentRegisterEvent;

@Component
public class RegisterEventListener {
	@Autowired
	private ApplicationEventPublisher publisher;

	@EventListener
	void handleRegister(StudentRegisterEvent event) {
		System.out.println("Registration event got triggered for student:: " + event.getName());
	}

/*	public void publishEvent(final String name) {
		publisher.publishEvent(new StudentRegisterEvent(name));
	}*/
}
