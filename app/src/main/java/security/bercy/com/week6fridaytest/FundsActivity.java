package security.bercy.com.week6fridaytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import security.bercy.com.week6fridaytest.Model.funds;
import security.bercy.com.week6fridaytest.data.remote.RemoteDataSource;

public class FundsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funds);

        Call<List<funds>> fundsCall = RemoteDataSource.getFunds();
        fundsCall.enqueue(new Callback<List<funds>>() {
            @Override
            public void onResponse(Call<List<funds>> call, Response<List<funds>> response) {
                List<funds> fundsList = response.body();

            }

            @Override
            public void onFailure(Call<List<funds>> call, Throwable t) {

            }
        });



    }
}
