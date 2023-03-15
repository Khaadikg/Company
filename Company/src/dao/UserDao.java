package dao;

import model.User;

import java.util.ArrayList;

public class UserDao {
    private static ArrayList<User> dataBase = new ArrayList<>();
//     private UserDao(User user) {
//         dataBase.add(user);
//     }
//    private UserDao() throws Exception{
//        throw new Exception("You entered empty UserData!");
//    }

    public static ArrayList<User> getDataBse() {
        return dataBase;
    }

    public static void addToDataBase(User user) {
        dataBase.add(user);
    }
}
