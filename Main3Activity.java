package com.example.editor;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18;
    Button bti;
int h,h1,h2,h3,h4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv1=(TextView)findViewById(R.id.textView10);
tv2=(TextView)findViewById(R.id.textView11) ;
      tv3=(TextView)findViewById(R.id.textView12) ;
        tv4=(TextView)findViewById(R.id.textView113) ;
        tv5=(TextView)findViewById(R.id.textView14) ;
        tv6=(TextView)findViewById(R.id.textView15) ;
        tv7=(TextView)findViewById(R.id.textView16) ;
        tv8=(TextView)findViewById(R.id.textView17) ;
        tv9=(TextView)findViewById(R.id.textView18) ;
        tv10=(TextView)findViewById(R.id.textView19) ;
        tv11=(TextView)findViewById(R.id.textView20) ;
        tv12=(TextView)findViewById(R.id.textView21) ;
        tv13=(TextView)findViewById(R.id.textView22) ;
        tv14=(TextView)findViewById(R.id.textView23) ;
        tv15=(TextView)findViewById(R.id.textView24) ;
        tv16=(TextView)findViewById(R.id.textView25) ;
        tv17=(TextView)findViewById(R.id.textView26) ;

        Boolean isC=getIntent().getExtras().getBoolean("momos");
        if(isC){
            tv1.setText("MOMO");
            tv2.setText(MainActivity.ss1);
            tv3.setText(MainActivity.ss2);

            h=Integer.parseInt(MainActivity.ss2);

           // tv2.getText(MainActivity.sd)Text(MainActivity.sd);


        }
        else{
            tv1.setText("-");
            tv2.setText("-");
            tv3.setText("-");
        }
        Boolean isC1=getIntent().getExtras().getBoolean("ROLLS");
        if(isC1){
            tv4.setText("ROLLS");
            tv5.setText(MainActivity.ss3);
            tv6.setText(MainActivity.ss4);
            // tv2.getText(MainActivity.sd)Text(MainActivity.sd);
            h1=Integer.parseInt(MainActivity.ss4);

        }
        else{
            tv4.setText("-");
            tv5.setText("-");
            tv6.setText("-");
        }
        Boolean isC2=getIntent().getExtras().getBoolean("NOODLE");
        if(isC2){
            tv7.setText("NOODLE");
            tv8.setText(MainActivity.ss5);
            tv9.setText(MainActivity.ss6);
            // tv2.getText(MainActivity.sd)Text(MainActivity.sd);
            h2=Integer.parseInt(MainActivity.ss6);

        }
        else{
            tv7.setText("-");
            tv8.setText("-");
            tv9.setText("-");
        }
        Boolean isC3=getIntent().getExtras().getBoolean("BURGER");
        if(isC3){
            tv10.setText("BURGER");
            tv11.setText(MainActivity.ss7);
            tv12.setText(MainActivity.ss8);
            h3=Integer.parseInt(MainActivity.ss8);
            // tv2.getText(MainActivity.sd)Text(MainActivity.sd);


        }
        else{
            tv10.setText("-");
            tv11.setText("-");
            tv12.setText("-");
        }
        Boolean isC4=getIntent().getExtras().getBoolean("PIZZA");
        if(isC4){
            tv13.setText("PIZZA");
            tv14.setText(MainActivity.ss9);
            tv15.setText(MainActivity.ss10);
            h4=Integer.parseInt(MainActivity.ss10);
            // tv2.getText(MainActivity.sd)Text(MainActivity.sd);


        }
        else{
            tv13.setText("-");
            tv14.setText("-");
            tv15.setText("-");
        }
        tv17.setText(Integer.toString(h+h1+h2+h3+h4));
    }
}
