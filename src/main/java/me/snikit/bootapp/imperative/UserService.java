package me.snikit.bootapp.imperative;

import java.time.Duration;
import java.util.Date;

import org.springframework.stereotype.Service;

import me.snikit.bootapp.models.User;
import me.snikit.bootapp.models.UserEvent;
import me.snikit.bootapp.reactive.UserReactiveRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

	private final UserReactiveRepo userRepo;

	public UserService(UserReactiveRepo userRepo) {
		this.userRepo = userRepo;
	}

	public Flux<User> getAllUsers() {
		return this.userRepo.findAll();
	}

	public Mono<User> getUserById(String id) {
		return this.userRepo.findById(id);
	}

	public Flux<UserEvent> getUserEvents(String id) {
		return Flux.<UserEvent>generate(sink -> sink.next(new UserEvent(id, new Date())))
				.delayElements(Duration.ofSeconds(1));
	}

}
