package com.example.studentnoob;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EditActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Button btnchangr = findViewById(R.id.btnchange);
        btnchangr.setOnClickListener(v ->{
            EditText name = (EditText)findViewById(R.id.editTextText_1);
                    String name1 = name.getText().toString();
            EditText mssv = (EditText)findViewById(R.id.editTextText_2);
            String mssv1 = mssv.getText().toString();
            Intent intent = new Intent(EditActivity.this, MainActivity.class);
            intent.putExtra("name", name1);
            intent.putExtra("mssv", mssv1);
            int y = getIntent().getIntExtra("position", -1);
            intent.putExtra("position", y);
            startActivity(intent);
        });
    }
}
