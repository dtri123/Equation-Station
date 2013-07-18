package com.example.theequationstation;

import com.example.theequationstation.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;


public class Division_Page extends Activity {
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.division_page);
        Button btn = (Button)findViewById(R.id.divide_button);
        btn.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v) {
         EditText et1 = (EditText)findViewById(R.id.editText_DiviA);
         String a_txt = et1.getText().toString();
         EditText et2 = (EditText)findViewById(R.id.editText_DiviB);
         String b_txt = et2.getText().toString();
         EditText et3 = (EditText)findViewById(R.id.editText_DiviDividend);
         String divi_txt = et3.getText().toString();
        
         RadioGroup rg = (RadioGroup)findViewById(R.id.group1);
         RadioButton rb_A = (RadioButton)findViewById(R.id.radioButtonDiviA);
         boolean find_A = rb_A.isChecked();
         RadioButton rb_B = (RadioButton)findViewById(R.id.radioButtonDiviB);
         boolean find_B = rb_B.isChecked();
         RadioButton rb_Dividend = (RadioButton)findViewById(R.id.radioButtonDividend);
         boolean find_Dividend = rb_Dividend.isChecked();
        
         Equations equation = new Equations();
        
         double a = equation.convertToDouble(a_txt);
         double b = equation.convertToDouble(b_txt);
         double dividend = equation.convertToDouble(divi_txt);
        
         double result = equation.divide(a, b, dividend, find_A, find_B, find_Dividend);
        
         if( find_A ) et1.setText(result+"");
         else if( find_B ) et2.setText(result+"");
         else if( find_Dividend ) et3.setText(result+"");
         }
        });

    }
}