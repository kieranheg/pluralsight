package com.example.kieran.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  private Button submitBtn;
  private EditText nameEditText;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    submitBtn = (Button) findViewById(R.id.submitBtn);
    nameEditText = (EditText) findViewById(R.id.nameEditText);

    submitBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        Bundle b = new Bundle();
        b.putString("name", nameEditText.getText().toString());
        b.putInt("age", 50);

        intent.putExtras(b);

        startActivity(intent);
      }
    });

  }
}
