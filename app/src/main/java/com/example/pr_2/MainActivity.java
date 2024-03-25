package com.example.pr_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "HelloWorld";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Вы нажали на кнопку", Toast.LENGTH_SHORT).show();
            }
        });

        Log.e(TAG,"error in onCreate");
        Log.w(TAG,"warning in onCreate");
        Log.i("IKBO-26-22","info in onCreate");
        Log.d("IKBO-26-22","debug in onCreate");
        Log.v("IKBO-26-22","verbose in onCreate");
    }

    public void onNextActivity(View view){
        EditText editTextText = findViewById(R.id.editTextText);
        EditText editTextText2 = findViewById(R.id.editTextText2);
        EditText editTextText3 = findViewById(R.id.editTextText3);
        EditText editTextText4 = findViewById(R.id.editTextText4);

        String fio = editTextText.getText().toString();
        String group_num = editTextText2.getText().toString();
        int age = Integer.parseInt(editTextText3.getText().toString());
        int grade = Integer.parseInt(editTextText4.getText().toString());

        Intent intent = new Intent(this, NewActivity1.class);
        intent.putExtra("fio", fio);
        intent.putExtra("group number", group_num);
        intent.putExtra("age", age);
        intent.putExtra("grade", grade);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"error in onStart");
        Log.w(TAG,"warning in onStart");
        Log.i("IKBO-26-22","info in onStart");
        Log.d("IKBO-26-22","debug in onStart");
        Log.v("IKBO-26-22","verbose in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"error in onResume");
        Log.w(TAG,"warning in onResume");
        Log.i("IKBO-26-22","info in onResume");
        Log.d("IKBO-26-22","debug in onResume");
        Log.v("IKBO-26-22","verbose in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"error in onPause");
        Log.w(TAG,"warning in onPause");
        Log.i("IKBO-26-22","info in onPause");
        Log.d("IKBO-26-22","debug in onPause");
        Log.v("IKBO-26-22","verbose in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"error in onStop");
        Log.w(TAG,"warning in onStop");
        Log.i("IKBO-26-22","info in onStop");
        Log.d("IKBO-26-22","debug in onStop");
        Log.v("IKBO-26-22","verbose in onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"error in onRestart");
        Log.w(TAG,"warning in onRestart");
        Log.i("IKBO-26-22","info in onRestart");
        Log.d("IKBO-26-22","debug in onRestart");
        Log.v("IKBO-26-22","verbose in onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"error in onDestroy");
        Log.w(TAG,"warning in onDestroy");
        Log.i("IKBO-26-22","info in onDestroy");
        Log.d("IKBO-26-22","debug in onDestroy");
        Log.v("IKBO-26-22","verbose in onDestroy");
    }
}