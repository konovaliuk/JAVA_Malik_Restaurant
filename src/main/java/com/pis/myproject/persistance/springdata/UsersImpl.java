package com.pis.myproject.persistance.springdata;

import com.pis.myproject.persistance.entities.Users;
import com.pis.myproject.persistance.interfcs.IUsers;
import com.pis.myproject.persistance.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("UsersService")
@Repository
@Transactional
public class UsersImpl implements IUsers {

    @Autowired
    private UsersRepository usersRepository;

    @Transactional(readOnly = true)
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Users> findByUserId(Integer userId) {
        return usersRepository.findByUserId(userId);
    }

    @Transactional(readOnly = true)
    public List<Users> findByLogin(String login) {
        return usersRepository.findByLogin(login);
    }

}
