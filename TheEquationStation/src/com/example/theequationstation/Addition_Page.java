package com.example.theequationstation;

import com.example.theequationstation.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;


public class Addition_Page extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addition_page);
        Button btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		EditText et1 = (EditText)findViewById(R.id.editText1);
        	    String txt1 = et1.getText().toString();
        	    EditText et2 = (EditText)findViewById(R.id.editText2);
        	    String txt2 = et2.getText().toString();
        	    EditText et3 = (EditText)findViewById(R.id.editText3);
        	    String txt3 = et3.getText().toString();
        	    Equations equation = new Equations();
        	    double a = equation.convertToDouble(txt1);
        	    double b = equation.convertToDouble(txt2);
        	    double sum = equation.convertToDouble(txt3);
        	    double result = equation.add(a, b, sum);
                TextView tw = (TextView)findViewById(R.id.textView2);
                tw.setText(result+"");
        	}
        });

    }
}
