package com.example.lht.chapter02;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SnackbarActivity extends AppCompatActivity {

    private Button bt_snackbar;
    private LinearLayout activity_snackbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        activity_snackbar = findViewById(R.id.activity_snackbar);
        bt_snackbar = findViewById(R.id.bt_snackbar);
        bt_snackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackbar();
            }
        });
    }

    private void showSnackbar() {
        Snackbar.make(activity_snackbar,"标题",Snackbar.LENGTH_SHORT).setAction("点击事件", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SnackbarActivity.this, "Toast", Toast.LENGTH_SHORT).show();
            }
        }).setDuration(Snackbar.LENGTH_SHORT).show();
    }
}
