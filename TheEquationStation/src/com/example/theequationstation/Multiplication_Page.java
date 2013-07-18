package com.example.theequationstation;

import com.example.theequationstation.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;


public class Multiplication_Page extends Activity {
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplication_page);
        Button btn = (Button)findViewById(R.id.multiply_button);
        btn.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v) {
         EditText et1 = (EditText)findViewById(R.id.editText_MultA);
         String a_txt = et1.getText().toString();
         EditText et2 = (EditText)findViewById(R.id.editText_MultB);
         String b_txt = et2.getText().toString();
         EditText et3 = (EditText)findViewById(R.id.editText_MultProduct);
         String prod_txt = et3.getText().toString();
        
         RadioGroup rg = (RadioGroup)findViewById(R.id.group1);
         RadioButton rb_A = (RadioButton)findViewById(R.id.radioButtonMultA);
         boolean find_A = rb_A.isChecked();
         RadioButton rb_B = (RadioButton)findViewById(R.id.radioButtonMultB);
         boolean find_B = rb_B.isChecked();
         RadioButton rb_Prod = (RadioButton)findViewById(R.id.radioButtonProduct);
         boolean find_Product = rb_Prod.isChecked();
        
         Equations equation = new Equations();
        
         double a = equation.convertToDouble(a_txt);
         double b = equation.convertToDouble(b_txt);
         double product = equation.convertToDouble(prod_txt);
        
         double result = equation.multiply(a, b, product, find_A, find_B, find_Product);
        
         if( find_A ) et1.setText(result+"");
         else if( find_B ) et2.setText(result+"");
         else if( find_Product ) et3.setText(result+"");
         }
        });

    }
}