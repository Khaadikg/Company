package service;
import excp.MyException;
import model.User;

import java.util.ArrayList;

public interface UserService {
    void addUser(User user);
    void findById(int id) throws MyException;
    void deleteById(int id) throws MyException;
    void printAllUsers();


}
