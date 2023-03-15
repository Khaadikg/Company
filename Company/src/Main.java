import enums.Enums;
import excp.MyException;
import model.User;
import service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) throws MyException {

        UserServiceImpl check = new UserServiceImpl();
        check.addUser(new User("Aziza", 12, Enums.WOMEN));
        check.addUser(new User("Azat", 12, Enums.MAN));
        check.addUser(new User("Optimus", 2606, Enums.TRANSFORMER));
        check.findById(1);
        System.out.println("------------");
        check.printAllUsers();
        System.out.println("------------");
        check.deleteById(2);
        check.printAllUsers();
    }
}