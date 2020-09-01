package me.snikit.bootapp.imperative;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import me.snikit.bootapp.models.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

}
