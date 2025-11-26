package empmanagement.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import empmanagement.demo.model.User;
import empmanagement.demo.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public boolean checkUsernameExists(String email) {
        return userRepository.findByEmail(email) != null;
    }

    public boolean validateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
