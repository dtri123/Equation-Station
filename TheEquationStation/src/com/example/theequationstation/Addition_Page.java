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
        Button btn = (Button)findViewById(R.id.add_button);
        btn.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v) {
         EditText et1 = (EditText)findViewById(R.id.editText_AddA);
         String a_txt = et1.getText().toString();
         EditText et2 = (EditText)findViewById(R.id.editText_AddB);
         String b_txt = et2.getText().toString();
         EditText et3 = (EditText)findViewById(R.id.editText_AddSum);
         String sum_txt = et3.getText().toString();
        
         RadioGroup rg = (RadioGroup)findViewById(R.id.group1);
         RadioButton rb_A = (RadioButton)findViewById(R.id.radioButtonAddA);
         boolean find_A = rb_A.isChecked();
         RadioButton rb_B = (RadioButton)findViewById(R.id.radioButtonAddB);
         boolean find_B = rb_B.isChecked();
         RadioButton rb_Sum = (RadioButton)findViewById(R.id.radioButtonSum);
         boolean find_Sum = rb_Sum.isChecked();
        
         Equations equation = new Equations();
        
         double a = equation.convertToDouble(a_txt);
         double b = equation.convertToDouble(b_txt);
         double sum = equation.convertToDouble(sum_txt);
        
         double result = equation.add(a, b, sum, find_A, find_B, find_Sum);
        
         if( find_A ) et1.setText(result+"");
         else if( find_B ) et2.setText(result+"");
         else if( find_Sum ) et3.setText(result+"");
         }
        });

    }
}