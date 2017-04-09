package geym.dg.ch2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld_an {

	private String message;

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	@Value("Hello World! From Annotation")
	public void setMessage(String message) {
		this.message = message;
	}


}
