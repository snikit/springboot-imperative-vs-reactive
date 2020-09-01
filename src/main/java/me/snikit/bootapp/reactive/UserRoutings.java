package me.snikit.bootapp.reactive;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;


@Configuration
public class UserRoutings {

	@Bean
	RouterFunction<?> routerFunction(UserHandler userHandler) {
		return route(GET("/reactive/users"), userHandler::getAllUsers).andRoute(GET("/reactive/users/{id}"), userHandler::getUserById)
				.andRoute(GET("/reactive/users/{id}/events"), userHandler::getUserEvents);
	}

}
