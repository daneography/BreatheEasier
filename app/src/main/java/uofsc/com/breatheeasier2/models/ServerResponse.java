package uofsc.com.breatheeasier2.models;

/**
 * Created by danea on 7/6/2017.
 */

public class ServerResponse {
    private String result;
    private String message;
    private Users user;

    public String getResult(){
        return result;
    }

    public String getMessage(){
        return message;
    }

    public Users getUser(){
        return user;
    }
}

