package com.example.pr_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView messageText = new TextView(this);
        messageText.setTextSize(26);
        messageText.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();
        if(arguments != null){
            String fio = arguments.get("fio").toString();
            String group_num = arguments.get("group number").toString();
            int age = arguments.getInt("age");
            int grade = arguments.getInt("grade");
            messageText.setText("FIO: " + fio + "\nGroup number: " + group_num + "\nAge: " + age + "\nGrade: " + grade);
        }

        setContentView(messageText);
    }
}