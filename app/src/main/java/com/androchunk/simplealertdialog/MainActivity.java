package com.androchunk.simplealertdialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnShowDialog = findViewById(R.id.btnShowDialog);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment simpleDialogFragment = new SimpleDialogFragment();
                simpleDialogFragment.setCancelable(false);
                simpleDialogFragment.show(getSupportFragmentManager(), "Simple dialog");
            }
        });


    }
}
