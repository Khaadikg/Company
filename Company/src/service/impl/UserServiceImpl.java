package service.impl;

import dao.UserDao;
import excp.MyException;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void addUser(User user) {
        UserDao.addToDataBase(user);
    }

    @Override
    public void findById(int id) throws MyException{
//        UserDao.getDataBse();
        boolean checkForCorrectId = false;
        for (User user: UserDao.getDataBse()) {
            try {
                if (user.getID() == id) {
                    System.out.println(user);
                    checkForCorrectId = true;
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        if (!checkForCorrectId) throw new MyException("Incorrect ID! -> ");
    }

    @Override
    public void deleteById(int id) throws MyException{
        boolean checkForCorrectId = false;
        for (int i = 0; i < UserDao.getDataBse().size(); i++) {
            try {
                if (UserDao.getDataBse().get(i).getID() == id) {
                    UserDao.getDataBse().remove(i);
                    checkForCorrectId = true;
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        if (!checkForCorrectId) throw new MyException("Incorrect ID! -> ");
    }

    @Override
    public void printAllUsers() {
        for (User user: UserDao.getDataBse()) {
            System.out.println(user);
        }
    }
}
