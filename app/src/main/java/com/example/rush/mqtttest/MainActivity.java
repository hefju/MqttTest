package com.example.rush.mqtttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.rush.mqtttest.chat.ChatActivity;
import com.example.rush.mqtttest.settings.FragmentPreferences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetButton();

    }



    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v){
            switch (v.getId()) {
                case R.id.button11:
                    Intent intent = new Intent(MainActivity.this, FragmentPreferences.class);
                    startActivity(intent);
                    break;
                case R.id.button12:
                    intent = new Intent(MainActivity.this, ChatActivity.class);
                    startActivity(intent);
                    break;
                case R.id.button13:

                    break;
                case R.id.button21:
                    break;
                case R.id.button22:
                    break;
                case R.id.button23:
                    break;
                case R.id.button31:
                    break;
                case R.id.button32:
                    break;
                case R.id.button33:
                    break;
                case R.id.button41:
                    break;
                case R.id.button42:
                    break;
                case R.id.button43:
                    break;
                case View.NO_ID:
                default:
                    // TODO Auto-generated method stub
                    break;
            }
        }};
    private void SetButton() {
        findViewById(R.id.button11).setOnClickListener(buttonClickListener);
        findViewById(R.id.button12).setOnClickListener(buttonClickListener);
        findViewById(R.id.button13).setOnClickListener(buttonClickListener);
        findViewById(R.id.button21).setOnClickListener(buttonClickListener);
        findViewById(R.id.button22).setOnClickListener(buttonClickListener);
        findViewById(R.id.button23).setOnClickListener(buttonClickListener);
        findViewById(R.id.button31).setOnClickListener(buttonClickListener);
        findViewById(R.id.button32).setOnClickListener(buttonClickListener);
        findViewById(R.id.button33).setOnClickListener(buttonClickListener);
        findViewById(R.id.button41).setOnClickListener(buttonClickListener);
        findViewById(R.id.button42).setOnClickListener(buttonClickListener);
        findViewById(R.id.button43).setOnClickListener(buttonClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
