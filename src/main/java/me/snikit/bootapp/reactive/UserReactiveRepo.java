package me.snikit.bootapp.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import me.snikit.bootapp.models.User;

public interface UserReactiveRepo extends ReactiveMongoRepository<User, String> {

}
