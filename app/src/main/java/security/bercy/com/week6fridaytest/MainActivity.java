package security.bercy.com.week6fridaytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showFunds(View view) {
        Intent intent = new Intent(this,FundsActivity.class);
        startActivity(intent);
    }
}
