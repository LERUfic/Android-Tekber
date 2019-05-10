package me.lerufic.belajarapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DosenActivity extends AppCompatActivity {
    Button btnRegister, btnMK, btnMyMK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen);
        String nameExtra = getIntent().getStringExtra("name");
        String userExtra = getIntent().getStringExtra("username");
        TextView tvUser = (TextView) findViewById(R.id.textView8);
        TextView tvName = (TextView) findViewById(R.id.textView9);
        tvUser.setText(userExtra);
        tvName.setText(nameExtra);

        btnRegister = (Button) findViewById(R.id.button);
        btnMK = (Button) findViewById(R.id.button3);
        btnMyMK = (Button) findViewById(R.id.button4);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(), RegisterActivity.class);
                startActivity(myIntent);
            }
        });
        btnMK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(), MKActivity.class);
                startActivity(myIntent);
            }
        });
        btnMyMK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(), MyMKActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
