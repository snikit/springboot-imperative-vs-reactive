package me.snikit.bootapp.reactive;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import me.snikit.bootapp.imperative.UserService;
import me.snikit.bootapp.models.User;
import reactor.core.publisher.Mono;

@Component
public class UserHandler {

	private final UserService userService;

	public UserHandler(UserService userService) {
		this.userService = userService;
	}

	public Mono<ServerResponse> getAllUsers(ServerRequest request) {
		return ServerResponse.ok().body(this.userService.getAllUsers(), User.class);
	}

	public Mono<ServerResponse> getUserById(ServerRequest request) {
		return ServerResponse.ok().body(this.userService.getUserById(request.pathVariable("id")), User.class);
	}

	public Mono<ServerResponse> getUserEvents(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM)
				.body(this.userService.getUserEvents(request.pathVariable("id")), User.class);

	}

}
