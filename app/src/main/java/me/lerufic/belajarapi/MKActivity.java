package me.lerufic.belajarapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.lerufic.belajarapi.Model.NoGetJadwal;
import me.lerufic.belajarapi.Model.NoGetUser;
import me.lerufic.belajarapi.Rest.ApiClient;
import me.lerufic.belajarapi.Rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MKActivity extends AppCompatActivity {

    EditText startmk, username, endmk, name, role;
    Button btLogin;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mk);

        startmk = (EditText) findViewById(R.id.editText3);
        endmk = (EditText) findViewById(R.id.editText);
        username = (EditText) findViewById(R.id.editText4);
        name = (EditText) findViewById(R.id.editText2);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        btLogin = (Button) findViewById(R.id.button2);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<NoGetJadwal> insertJadwalCall = mApiInterface.insertJadwal(username.getText().toString(),
                        startmk.getText().toString(),
                        endmk.getText().toString(),
                        name.getText().toString());
                insertJadwalCall.enqueue(new Callback<NoGetJadwal>() {
                    @Override
                    public void onResponse(Call<NoGetJadwal> call, Response<NoGetJadwal> response) {
//                        Intent myIntent = new Intent(getBaseContext(), LoginActivity.class);
//                        startActivity(myIntent);
                        finish();
                    }

                    @Override
                    public void onFailure(Call<NoGetJadwal> call, Throwable t) {
                        Log.e("Retrofit Get", t.toString());
//                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
