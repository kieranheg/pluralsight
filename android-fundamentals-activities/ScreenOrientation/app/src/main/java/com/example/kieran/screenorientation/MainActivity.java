package com.example.kieran.screenorientation;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  private static final String KEY = "KEY";
  private static final String MSG = "MSG";

  private static final String TAG = MainActivity.class.getSimpleName();

  private TextView txvMessage;
  private EditText etName;
  private Button btnSubmit;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Log.i(TAG, "onCreate()");

    etName = (EditText) findViewById(R.id.etName);
    txvMessage = (TextView) findViewById(R.id.txvMessage);
    btnSubmit = (Button) findViewById(R.id.btnSubmit);

    btnSubmit.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        txvMessage.setText("Welcome " + etName.getText().toString());
        btnSubmit.setText("LOGOUT");
      }
    });
  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    Log.i(TAG, "onRestoreInstanceState()");

    txvMessage.setText(savedInstanceState.getString(MSG));
    btnSubmit.setText(savedInstanceState.getString(KEY));

    Toast.makeText(getApplicationContext(), "Restoring", Toast.LENGTH_SHORT).show();
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.i(TAG, "onStart()");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.i(TAG, "onResume()");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Log.i(TAG, "onRestart()");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.i(TAG, "onPause()");
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    Log.i(TAG, "onSaveInstanceState()");

    outState.putString(MSG, txvMessage.getText().toString());
    outState.putString(KEY, btnSubmit.getText().toString());

    Toast.makeText(getApplicationContext(), "Saving", Toast.LENGTH_SHORT).show();
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.i(TAG, "onStop()");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.i(TAG, "onDestroy()");
  }
}
