package dio.rafael.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.rafael.springdatajpa.model.User;
import dio.rafael.springdatajpa.repository.UserRepository;


@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
                user.setName("Rafael");
                user.setUsername("caco");
                user.setPassword("caco15");

                repository.save(user);

                for(User u: repository.findAll()){
                    System.out.println(u);
                }
        
    }

    
}
