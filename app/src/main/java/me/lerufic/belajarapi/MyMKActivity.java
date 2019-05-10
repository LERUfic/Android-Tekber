package me.lerufic.belajarapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.lerufic.belajarapi.Model.NoGetJadwal;
import me.lerufic.belajarapi.Model.NoGetMyMK;
import me.lerufic.belajarapi.Rest.ApiClient;
import me.lerufic.belajarapi.Rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyMKActivity extends AppCompatActivity {

    EditText matkul_id, mhs_id;
    Button btLogin;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_mk);

        matkul_id = (EditText) findViewById(R.id.editText3);
        mhs_id = (EditText) findViewById(R.id.editText);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        btLogin = (Button) findViewById(R.id.button2);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<NoGetMyMK> insertMyMKCall = mApiInterface.joinMhs(matkul_id.getText().toString(),
                        mhs_id.getText().toString());
                insertMyMKCall.enqueue(new Callback<NoGetMyMK>() {
                    @Override
                    public void onResponse(Call<NoGetMyMK> call, Response<NoGetMyMK> response) {
//                        Intent myIntent = new Intent(getBaseContext(), LoginActivity.class);
//                        startActivity(myIntent);
                        finish();
                    }

                    @Override
                    public void onFailure(Call<NoGetMyMK> call, Throwable t) {
                        Log.e("Retrofit Get", t.toString());
//                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
