package com.ade.step1.viewmodel;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import com.ade.step1.R;

/**
 * Created by RadyaLabs PC on 29/11/2017.
 */

public class BaseVM extends ViewModel {

    ProgressDialog progressDialog;

    BaseVM() {
    }

    //Todo: Show Progress Loading
    void showProgressLoading(Context context, boolean isCancelable) {

        progressDialog = new ProgressDialog(context);
        progressDialog.setIndeterminate(true);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(isCancelable);
        progressDialog.setCanceledOnTouchOutside(false);

        progressDialog.show();

    }

    //Todo: Dismiss Progress Loading
    void dismissProgressLoading() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    void showDialogAlert(Activity activity, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.AlertDialog);
        builder.setMessage(message);
        builder.setPositiveButton("Ok", null);
        builder.show();
    }

    void showToastAlert(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public interface IBaseViewModel {

        void showLoading(Context context, boolean isCancelable);

        void dismissLoading();

        void showAlert(Activity activity, String message);

        void showToast(Context context, String message);

    }

}
