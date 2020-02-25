package com.pis.myproject.persistance.springdata;

import com.pis.myproject.persistance.entities.Users;
import com.pis.myproject.persistance.interfcs.IUsers;
import com.pis.myproject.persistance.repositories.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository("UsersService")
@Transactional
@AllArgsConstructor
public class UsersImpl implements IUsers {

    private UsersRepository usersRepository;

    public List<Users> findAll() {
        return (List<Users>) usersRepository.findAll();
    }

    public Optional<Users> findByUserId(Integer userId) {
        return usersRepository.findById(userId);
    }

    public List<Users> findByLogin(String login) {
        return usersRepository.findByLogin(login);
    }

    @Override
    public void save(Users users) {
        usersRepository.save(users);
    }

}
