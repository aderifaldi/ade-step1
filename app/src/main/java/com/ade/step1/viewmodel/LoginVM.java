package com.ade.step1.viewmodel;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;

import com.ade.step1.helper.Constant;
import com.ade.step1.model.User;
import com.ade.step1.view.HomeActivity;

/**
 * Created by aderifaldi on 2017-12-24.
 */

public class LoginVM extends BaseVM {

    public void checkUser(final Activity activity, String username, String password) {

        String loginMessage;

        if (TextUtils.isEmpty(username)) {
            showToastAlert(activity, "Username must field!");
        } else if (TextUtils.isEmpty(password)) {
            showToastAlert(activity, "Password must field!");
        } else {
            User user = new User();

            if (username.equals(Constant.TRUE_USERNAME) && password.equals(Constant.TRUE_PASSWORD)) {
                user.setUsername(Constant.TRUE_USERNAME);
                loginMessage = "Login as true user";
            } else {
                user.setUsername("Guest");
                loginMessage = "Login as guest";
            }

            showToastAlert(activity, loginMessage);
            activity.startActivity(new Intent(activity, HomeActivity.class)
                    .putExtra("user", user));
        }

    }

}
