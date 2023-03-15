package excp;

public class MyException extends Exception{
    private int number;

    public MyException(String message){
        super(message);
    }
}