package model;
import enums.Enums;
public class User {
    private int ID = 1;
    private static int id = 1;
    private String name;
    private int age;
    private Enums gender;

    public User(String name, int age, Enums gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        ID = id++;
    }

    public int getID() {
        return ID;
    }

//    public void setID(int ID) {
//        User.ID = ID;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Enums getGender() {
        return gender;
    }

    public void setGender(Enums gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ID = " + ID
                + "; Name = " + getName()
                + "; Age = " + getAge()
                + "; Gender = " + getGender();
    }
}
