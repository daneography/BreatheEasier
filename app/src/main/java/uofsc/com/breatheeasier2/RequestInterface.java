package uofsc.com.breatheeasier2;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import uofsc.com.breatheeasier2.models.ServerRequest;
import uofsc.com.breatheeasier2.models.ServerResponse;

/**
 * Created by danea on 7/6/2017.
 */

public interface RequestInterface {

    @POST("breatheasy-login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);
}