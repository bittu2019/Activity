package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Second extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text = (TextView)findViewById(R.id.result);
        Bundle b1=getIntent().getExtras();
        String s1 =b1.getString("user");
        text.setText(s1);

    }
}
