package com.ade.step1.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.ade.step1.R;
import com.ade.step1.model.User;

public class HomeActivity extends AppCompatActivity {

    private TextView username;

    private Intent intent;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        intent = getIntent();
        if (intent != null){
            user = (User) intent.getExtras().getSerializable("user");
        }

        username = findViewById(R.id.username);

        username.setText(user.getUsername());

    }
}
