package com.example.studentnoob;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Button btn = findViewById(R.id.btnadd);
        EditText name = findViewById(R.id.editTextText);
        EditText mssv = findViewById(R.id.editTextText2);
        btn.setOnClickListener(view -> {
            String name1 = name.getText().toString();
            String mssv1 = mssv.getText().toString();
            if(name1.equals("") || mssv1.equals("")){ Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            }else{
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("name", name1);
                intent.putExtra("mssv", mssv1);
                startActivity(intent);
            }
        });
    }
}
