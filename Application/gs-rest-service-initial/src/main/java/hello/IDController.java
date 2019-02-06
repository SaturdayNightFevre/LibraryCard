package hello;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IDController {
	
	@RequestMapping("/id/{id}")	// ensure HTTP requests to /greeting are mapped to greeting() method
	public UUID id(@PathVariable(value="id") UUID id  ) {
		return id(id);
				
	}

}