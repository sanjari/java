package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private float n;
    private float m;
    private float w;
    private float r;
    private String ch;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        final EditText etxt  =(EditText) findViewById(R.id.etxt);
        Button bnt1 =(Button) findViewById(R.id.btn1);
        Button bnt2 =(Button) findViewById(R.id.btn2);
        Button bnt3 =(Button) findViewById(R.id.btn3);
        Button bnt4 =(Button) findViewById(R.id.btn4);
        Button bnt5 =(Button) findViewById(R.id.btn5);
        final Button bnt6 =(Button) findViewById(R.id.btn6);
        Button bnt7 =(Button) findViewById(R.id.btn7);
        Button bnt8 =(Button) findViewById(R.id.btn8);
        Button bnt9 =(Button) findViewById(R.id.btn9);
        Button bnt0 =(Button) findViewById(R.id.btn0);
        Button bntdat =(Button) findViewById(R.id.btndat);
        Button bntp =(Button) findViewById(R.id.btnp);
        Button bntmi =(Button) findViewById(R.id.btnmi);
        Button bntmu =(Button) findViewById(R.id.btnmu);
        Button bntdi =(Button) findViewById(R.id.btndi);
        Button bntmo =(Button) findViewById(R.id.btnmo);
        Button bntcl =(Button) findViewById(R.id.btncl);

        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + "1");
            }
        });
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + "2");
            }
        });
        bnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + "3");
            }
        });
        bnt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + "4");
            }
        });
        bnt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + "5");
            }
        });
        bnt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + "6");
            }
        });
        bnt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + "7");
            }
        });
        bnt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + "8");
            }
        });
        bnt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + "9");
            }
        });
        bnt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + "0");
            }
        });
        bntdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText(etxt.getText() + ".");
            }
        });
        bntp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n !=0){
                    m =Float.parseFloat(etxt.getText().toString());
                    n = n+m;
                    ch ="+";
                    etxt.setText("");
                }
                else {
                    n = Float.parseFloat(etxt.getText().toString());
                    ch ="+";
                    etxt.setText("");
                }
            }
        });
        bntmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n !=0){
                    m =Float.parseFloat(etxt.getText().toString());
                    n = n-m;
                    ch ="-";
                    etxt.setText("");
                }
                else {
                    n = Float.parseFloat(etxt.getText().toString());
                    ch ="-";
                    etxt.setText("");
                }
            }
        });
        bntmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n !=0){
                    m =Float.parseFloat(etxt.getText().toString());
                    n = n*m;
                    ch ="*";
                    etxt.setText("");
                }
                else {
                    n = Float.parseFloat(etxt.getText().toString());
                    ch ="*";
                    etxt.setText("");
                }
            }
        });
        bntdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n !=0){
                    m =Float.parseFloat(etxt.getText().toString());
                    n = n/m;
                    ch ="/";
                    etxt.setText("");
                }
                else {
                    n = Float.parseFloat(etxt.getText().toString());
                    ch ="/";
                    etxt.setText("");
                }
            }
        });
        bntmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w =Float.parseFloat(etxt.getText().toString());
                switch (ch){
                    case "+":
                        r = w+n;
                        etxt.setText(r+"");
                        break;
                    case "-":
                        r = n-w;
                        etxt.setText(r+"");
                        break;
                    case "*":
                        r = w*n;
                        etxt.setText(r+"");
                        break;
                    case "/":
                        r = n/w;
                        etxt.setText(r+"");
                        break;
                    default:
                        Toast.makeText(getApplication(),"eror",Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        bntcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt.setText("");
                w =0;
                n =0;

            }
        });

    }
}
