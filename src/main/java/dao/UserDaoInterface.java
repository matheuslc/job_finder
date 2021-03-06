package dao;

import model.User;

import java.util.List;

public interface UserDaoInterface extends DAO<User> {
    List<User> findAll();

    List<User> findUserByCPF(String cpf);

    User findById(int id);

    User authenticate(String login, String password);
}
