package com.example.amank.contectmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText e1,e2,e3;
    CheckBox c1;
    RadioGroup rg1;
    RadioButton r1,r2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv=(TextView)findViewById(R.id.txtV);
        btn=(Button)findViewById(R.id.btnClick);
        e1=(EditText)findViewById(R.id.txtNum);
        e2=(EditText)findViewById(R.id.txtName);
        e3=(EditText)findViewById(R.id.txtRoll);
        c1=(CheckBox)findViewById(R.id.chBox);
        r1=(RadioButton)findViewById(R.id.rdMale);
        r2=(RadioButton)findViewById(R.id.rdFemale);
        rg1=(RadioGroup)findViewById(R.id.rdgrp1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c1.isChecked())
                {
                    StringBuilder result=new StringBuilder();

                    String phNo=e1.getText().toString();
                    result.append("\n Phone Number: "+phNo);

                    String Name=e2.getText().toString();
                    result.append("\n Name: "+Name);

                    String rNo=e1.getText().toString();
                    result.append("\n Roll Number: "+rNo);

                    int selectedID = rg1.getCheckedRadioButtonId();

                    if (selectedID == R.id.rdMale) {
                        String st="Male";
                        result.append("\n Gender: "+st);
                    }
                    else if (selectedID == R.id.rdFemale) {
                        String st="Female";
                        result.append("\n Gender: "+st);
                    }

                    Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
                    tv.setText("");
                    tv.setText(String.valueOf(result.toString()));
                }
                else {
                    Toast.makeText(MainActivity.this, "Pls Accept terms and Condition", Toast.LENGTH_SHORT).show();
                    tv.setText("");
                }
            }
        });

    }
}
