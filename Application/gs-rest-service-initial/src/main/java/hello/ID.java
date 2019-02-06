package hello;

import java.util.UUID;

public class ID {
		
	private final UUID id = UUID.randomUUID();

	public UUID getId() {
		return id;
	}
}
