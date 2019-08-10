package com.example.editor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6;
    TextView t7,t8,t9,t10,t11,t12;
    Button b,b1,bt;
    Button jh,jh1,jh2,jh3,jh4,jh5,jh6,jh7,jh8;
   static int count=1,p=1,q=1,r=1,s=1;
   static String a,c,d,sd,ss1,ss2,ss3,ss4,sd2,a1,ss5,ss6,ss7,ss8,ss9,ss10;
    CheckBox ch,ch1,ch2,ch3,ch4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t5=(TextView)findViewById(R.id.textView6);
        t6=(TextView)findViewById(R.id.textView7);


        bt=(Button)findViewById(R.id.button4);
        t1=(TextView)findViewById(R.id.tt3);
        t2=(TextView)findViewById(R.id.tt4);
        jh=(Button)findViewById(R.id.bb3);
        jh1=(Button)findViewById(R.id.bb4);
        jh2=(Button)findViewById(R.id.bb5);
        t7=(TextView)findViewById(R.id.tt5);
        t8=(TextView)findViewById(R.id.tt6);
        jh3=(Button)findViewById(R.id.bb6);
        jh4=(Button)findViewById(R.id.bb7);
        jh5=(Button)findViewById(R.id.bb8);
        t9=(TextView)findViewById(R.id.tt7);
        t10=(TextView)findViewById(R.id.tt8);
        t11=(TextView)findViewById(R.id.tt9);
        t12=(TextView)findViewById(R.id.tt10);


        jh7=(Button)findViewById(R.id.bb9);
        jh8=(Button)findViewById(R.id.bb10);
        ch=(CheckBox)findViewById(R.id.cx);
        ch1=(CheckBox)findViewById(R.id.c1);
        ch2=(CheckBox)findViewById(R.id.c2);
        ch3=(CheckBox)findViewById(R.id.c3);
        ch4=(CheckBox)findViewById(R.id.c4);
        ch.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (ch.isChecked() == true) {
                            b=(Button)findViewById(R.id.button2);

                            Toast.makeText(MainActivity.this, "Added to cart", Toast.LENGTH_LONG).show();
                            String s1="MOMOS";
                            b.setOnClickListener(new View.OnClickListener() {

                                @Override
                                public void onClick(View v) {

                                    if (count > 0)
                                        count--;
                                    String sd=Integer.toString(count);
                                    t5.setText(sd);
                                    String a = Integer.toString(count * 200);
                                    t6.setText(a);
                                }
                            });
                            b1=(Button)findViewById(R.id.button3);
                            b1.setOnClickListener(new View.OnClickListener() {

                                @Override
                                public void onClick(View v) {
                                    count++;
                                    String sd=Integer.toString(count);
                                    t5.setText(sd);
                                    String a = Integer.toString(count * 200);
                                    t6.setText(a);
                                }
                            });
                        }
                        else{
                            count=1;
                            t5.setText(null);
                            t6.setText(null);
                        }
                    }




                });
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch2.isChecked() == true) {
                    Toast.makeText(MainActivity.this, "added to cart", Toast.LENGTH_LONG).show();
String s1="Rolls";
                    jh1.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            if (p > 0)
                                p--;
                            String sd2=Integer.toString(p);
                            t1.setText(sd2);
                            String a1= Integer.toString(p* 300);
                            t2.setText(a1);
                        }
                    });

                    jh.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            p++;
                            String sd2=Integer.toString(p);
                            t1.setText(sd2);
                            String a1 = Integer.toString(p* 300);
                            t2.setText(a1);
                        }
                    });
                }
                else{
                    p=1;
                    t1.setText(null);
                    t2.setText(null);
                }
            }




        });
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch3.isChecked() == true) {
                    Toast.makeText(MainActivity.this, "added to cart", Toast.LENGTH_LONG).show();
                    String s1="Rolls";
                    jh3.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            if (q > 0)
                                q--;
                            String sd2=Integer.toString(p);
                            t7.setText(sd2);
                            String a1= Integer.toString(q* 300);
                            t8.setText(a1);
                        }
                    });

                    jh2.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            q++;
                            String sd2=Integer.toString(q);
                            t7.setText(sd2);
                            String a1 = Integer.toString(q* 300);
                            t8.setText(a1);
                        }
                    });
                }
                else{
                    q=1;
                    t7.setText(null);
                    t8.setText(null);
                }
            }




        });
        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch4.isChecked() == true) {
                    Toast.makeText(MainActivity.this, "added to cart", Toast.LENGTH_LONG).show();

                    jh5.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            if (r> 0)
                                r--;
                            String sd2=Integer.toString(p);
                            t9.setText(sd2);
                            String a1= Integer.toString(r* 300);
                            t10.setText(a1);
                        }
                    });

                    jh4.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            r++;
                            String sd2=Integer.toString(r);
                            t9.setText(sd2);
                            String a1 = Integer.toString(r* 300);
                            t10.setText(a1);
                        }
                    });
                }
                else{
                    r=1;
                    t9.setText(null);
                    t10.setText(null);
                }
            }




        });
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch1.isChecked() == true) {
                    Toast.makeText(MainActivity.this, "added to cart", Toast.LENGTH_LONG).show();

                    jh8.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            if (s> 0)
                                s--;
                            String sd2=Integer.toString(p);
                            t11.setText(sd2);
                            String a1= Integer.toString(s* 200);
                            t12.setText(a1);
                        }
                    });

                    jh7.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            s++;
                            String sd2=Integer.toString(s);
                            t11.setText(sd2);
                            String a1 = Integer.toString(s* 300);
                            t12.setText(a1);
                        }
                    });
                }
                else{
                    s=1;
                    t11.setText("1");
                    t12.setText("200");
                }
            }




        });


        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ss1=t5.getText().toString();
                ss2=t6.getText().toString();
ss3=t1.getText().toString();
ss4=t2.getText().toString();
ss5=t7.getText().toString();
ss6=t8.getText().toString();
                ss7=t9.getText().toString();
                ss8=t10.getText().toString();
                ss9=t11.getText().toString();
                ss10=t12.getText().toString();
                Intent obje=new Intent(MainActivity.this,Main3Activity.class);
                Intent obje1=new Intent(MainActivity.this,Main3Activity.class);
                obje.putExtra("momos",ch.isChecked());
                obje.putExtra("ROLLS",ch2.isChecked());
                obje.putExtra("NOODLE",ch3.isChecked());
                obje.putExtra("BURGER",ch4.isChecked());
                obje.putExtra("PIZZA",ch1.isChecked());
                startActivity(obje);


            }
        });

        }


    }


