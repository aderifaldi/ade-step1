package com.ade.step1.view;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ade.step1.R;
import com.ade.step1.viewmodel.SplashScreenVM;

public class SplashScreenActivity extends AppCompatActivity {

    private static final int DELAY = 3000;

    private SplashScreenVM viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);

        viewModel = ViewModelProviders.of(this).get(SplashScreenVM.class);

        viewModel.runSplashDelay(SplashScreenActivity.this, LoginActivity.class, DELAY);

    }

}
