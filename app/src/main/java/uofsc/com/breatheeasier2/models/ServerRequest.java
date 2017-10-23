package uofsc.com.breatheeasier2.models;

/**
 * Created by danea on 6/29/2017.
 */

public class ServerRequest {

    private String operation;
    private Users user;

    public void setOperation(String operation){
        this.operation = operation;
    }

    public void setUser(Users user){
        this.user = user;
    }
}
