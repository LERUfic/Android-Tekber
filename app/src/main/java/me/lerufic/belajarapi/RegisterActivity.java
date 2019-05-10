package me.lerufic.belajarapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.lerufic.belajarapi.Model.NoGetUser;
import me.lerufic.belajarapi.Rest.ApiClient;
import me.lerufic.belajarapi.Rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
    EditText password, username, repassword, name, role;
    Button btLogin;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        password = (EditText) findViewById(R.id.editText3);
        repassword = (EditText) findViewById(R.id.editText);
        username = (EditText) findViewById(R.id.editText4);
        name = (EditText) findViewById(R.id.editText2);
        role = (EditText) findViewById(R.id.editText5);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        btLogin = (Button) findViewById(R.id.button2);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<NoGetUser> insertUserCall = mApiInterface.insertUser(username.getText().toString(),
                        password.getText().toString(),
                        repassword.getText().toString(),
                        name.getText().toString(),
                        role.getText().toString());
                insertUserCall.enqueue(new Callback<NoGetUser>() {
                    @Override
                    public void onResponse(Call<NoGetUser> call, Response<NoGetUser> response) {
//                        Intent myIntent = new Intent(getBaseContext(), LoginActivity.class);
//                        startActivity(myIntent);
                        finish();
                    }

                    @Override
                    public void onFailure(Call<NoGetUser> call, Throwable t) {
                        Log.e("Retrofit Get", t.toString());
//                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
