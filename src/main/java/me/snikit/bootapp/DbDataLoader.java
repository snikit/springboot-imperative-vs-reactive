//package me.snikit.bootapp;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.stereotype.Component;
//
//import me.snikit.bootapp.models.User;
//import me.snikit.bootapp.repo.UserReactiveRepo;
//import reactor.core.publisher.Flux;
//
//@Component
//public class DbDataLoader {
//	private final UserReactiveRepo userRepo;
//
//	public DbDataLoader(UserReactiveRepo userRepo) {
//		this.userRepo = userRepo;
//	}
//
//	@PostConstruct
//	private void loadData() {
////		this.userRepo.deleteAll()
////				.thenMany(Flux.just("Voider", "También", "Fluxers").map(User::new).flatMap(this.userRepo::save))
////				.subscribe(System.out::println);
//
////        System.out.println("\nAll records in DB:\n");
////        this.userRepo
////                .findAll()
////                .subscribe(user -> System.out.println("> Found in DB: " + user.toString()));
//	}
//
//}
