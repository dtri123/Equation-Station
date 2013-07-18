package com.example.theequationstation;

import com.example.theequationstation.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class Subtraction_Page extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subtraction_page);
        Button btn = (Button)findViewById(R.id.button_subtract);
        btn.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		EditText et1 = (EditText)findViewById(R.id.editText_A);
        	    String a_txt = et1.getText().toString();
        	    EditText et2 = (EditText)findViewById(R.id.editText_B);
        	    String b_txt = et2.getText().toString();
        	    EditText et3 = (EditText)findViewById(R.id.editText_Diff);
        	    String diff_txt = et3.getText().toString();
        	    
        	    RadioGroup rg = (RadioGroup)findViewById(R.id.group1);
        	    RadioButton rb_A = (RadioButton)findViewById(R.id.radioButtonSubA);
        	    boolean find_A = rb_A.isChecked();
        	    RadioButton rb_B = (RadioButton)findViewById(R.id.radioButtonSubB);
        	    boolean find_B = rb_B.isChecked();
        	    RadioButton rb_Diff = (RadioButton)findViewById(R.id.radioButtonDiff);
        	    boolean find_Diff = rb_Diff.isChecked()
        	    
        	    Equations equation = new Equations();
        	    
        	    double a = equation.convertToDouble(a_txt);
        	    double b = equation.convertToDouble(b_txt);
        	    double diff = equation.convertToDouble(diff_txt);
        	    
        	    double result = equation.subtract(a, b, diff, find_A, find_B, find_Diff);
        	    
        	    if( find_A ) et1.setText(result+"");
        	    else if( find_B ) et2.setText(result+"");
        	    else if( find_Diff ) et3.setText(result+"");
        	}
        });
        }
	}
}
