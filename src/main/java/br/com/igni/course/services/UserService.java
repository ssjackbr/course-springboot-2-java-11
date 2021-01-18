package br.com.igni.course.services;

import br.com.igni.course.entities.User;
import br.com.igni.course.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById (Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert (User obj){
        return repository.save(obj);
    }

    public void delete (Long id) {
        repository.deleteById(id);
    }


}
