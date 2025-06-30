package com.springmongodb.main.services;

import com.springmongodb.main.domain.User;
import com.springmongodb.main.dto.UserDTO;
import com.springmongodb.main.repository.UserRepository;
import com.springmongodb.main.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public  void delete(String id){

        findById(id);
        repo.deleteById(id);

    }

    public User update(User obj){
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objtDto){
        return new User(objtDto.getId(), objtDto.getName(), objtDto.getEmail());
    }

}
