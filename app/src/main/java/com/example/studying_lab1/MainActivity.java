package com.example.studying_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View view){
        String msg = "Hello Toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this,msg,duration);

        toast.show();

    }

    public void testToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void contThis(View view){
        Context ctx= getApplicationContext();
        EditText tv = new EditText(this);
        Toast toast = Toast.makeText(this,"hey context",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER| Gravity.CENTER, 0, 0);
        toast.show();
    }

}