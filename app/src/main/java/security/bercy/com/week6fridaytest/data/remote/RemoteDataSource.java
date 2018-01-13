package security.bercy.com.week6fridaytest.data.remote;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import security.bercy.com.week6fridaytest.Model.funds;

/**
 * Created by Bercy on 1/12/18.
 */

public class RemoteDataSource {
    public static final String BASE_URL = "http://iwg-prod-web-interview.azurewebsites.net";


    public static Retrofit create() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }

    public static Call<List<funds>> getFunds() {
        Retrofit retrofit = create();
        RemoteService remoteService = retrofit.create(RemoteService.class);
        return remoteService.getFunds();
    }





    interface RemoteService {
     @GET("stem/v1/funds")
     Call<List<funds>> getFunds();
    }

}
