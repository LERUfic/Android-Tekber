package me.lerufic.belajarapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import me.lerufic.belajarapi.Model.GetUser;
import me.lerufic.belajarapi.Model.Kontak;
import me.lerufic.belajarapi.Model.User;
import me.lerufic.belajarapi.Rest.ApiClient;
import me.lerufic.belajarapi.Rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    EditText password, username;
    Button btLogin;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        password = (EditText) findViewById(R.id.editText3);
        username = (EditText) findViewById(R.id.editText4);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        btLogin = (Button) findViewById(R.id.button2);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<GetUser> getUserCall = mApiInterface.getUser(username.getText().toString(), password.getText().toString());
                getUserCall.enqueue(new Callback<GetUser>() {
                    @Override
                    public void onResponse(Call<GetUser> call, Response<GetUser> response) {
                        User myUser;
                        List<User> userList = response.body().getListDataUser();
                        Log.d("list", userList.toString());
                        myUser = userList.get(0);
                        if(myUser.getRole().equals("1")){
                            Intent myIntent = new Intent(getBaseContext(), DosenActivity.class);
                            myIntent.putExtra("username", myUser.getUsername());
                            myIntent.putExtra("role", myUser.getRole());
                            myIntent.putExtra("name", myUser.getName());
                            startActivity(myIntent);
                        }else if(myUser.getRole().equals("2")){
                            Intent myIntent = new Intent(getBaseContext(), DosenActivity.class);
                            myIntent.putExtra("username", myUser.getUsername());
                            myIntent.putExtra("role", myUser.getRole());
                            myIntent.putExtra("name", myUser.getName());
                            startActivity(myIntent);
                        }
//                        Intent myIntent = new Intent(getBaseContext(), MainActivity.class);
//                        startActivity(myIntent);
                        finish();
                    }

                    @Override
                    public void onFailure(Call<GetUser> call, Throwable t) {
                        Log.e("Retrofit Get", t.toString());
//                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
