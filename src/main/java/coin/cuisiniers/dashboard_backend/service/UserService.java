package coin.cuisiniers.dashboard_backend.service;

import coin.cuisiniers.dashboard_backend.model.User;
import coin.cuisiniers.dashboard_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
