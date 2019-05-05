package com.example.lht.chapter02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MyClick(View view) {
        switch (view.getId()){
            case R.id.bt_snackbarActivity:
                startActivity(new Intent(MainActivity.this,SnackbarActivity.class));
                break;
            case R.id.bt_textInputLayoutActivity:
                startActivity(new Intent(MainActivity.this,TextInputLayoutActivity.class));
                break;
            case R.id.bt_floatingActionButtonActivity:
                startActivity(new Intent(MainActivity.this,FloatingActionButtonActivity.class));
                break;
            case R.id.bt_tabLayoutActivity:
                startActivity(new Intent(MainActivity.this,TabLayoutActivity.class));
                break;
            case R.id.bt_collapsingToolbarLayout:
                startActivity(new Intent(MainActivity.this,CollpasingToolbarActivity.class));
                break;

        }
    }
}
