package com.example.theequationstation;

import android.os.Bundle;
import android.app.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.net.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView btn = (TextView)findViewById(R.id.equationButton);
        btn.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		Intent otherIntent = new Intent(MainActivity.this, equationCategories.class);
        		startActivity(otherIntent);
        	}
        });	
    }


   
}