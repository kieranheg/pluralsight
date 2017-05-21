package com.example.kieran.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

  private static final String TAG = SecondActivity.class.getSimpleName();

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    TextView textView = (TextView) findViewById(R.id.textView);

    StringBuilder msg = new StringBuilder("Welcome \n");

    Intent intent = getIntent();
    Bundle bundle = intent.getExtras();

    String name = bundle.containsKey("name") && !bundle.getString("name").isEmpty() ? bundle.getString("name") : "no name provided!";
    msg.append(name);
    Log.i(TAG, "Name: " + name);

    int age = bundle.containsKey("age") ? bundle.getInt("age") : 999;
    msg.append("\n").append(age).append(" years old!");
    Log.i(TAG, "Age: " + age);

    textView.setText(msg);

  }
}
