package me.snikit.bootapp.imperative;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.snikit.bootapp.models.User;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserRepo userRepo;

	public UserController(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	@GetMapping
	public List<User> getUsers() {

		return this.userRepo.findAll();
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable String id) {
		return this.userRepo.findById(id).orElse(null);
	}

}
