package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")	// ensure HTTP requests to /greeting are mapped to greeting() method
	public Greeting greeting(@RequestParam(value="name", defaultValue="User") String name  ) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}

}
