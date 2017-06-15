package com.hb.day01.test01;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    EditText tf;
//    Button btn;
//    TextView lb;
//    private String msg;
//    LinearLayout base;
    boolean tf;

    public void onClick(View v){
        ImageView iv= (ImageView) findViewById(R.id.imageView);
        if(tf) {
            iv.setImageResource(R.drawable.big01);
            tf=false;
        }else{
            iv.setImageResource(R.drawable.big02);
            tf=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

////////////////////    3   //////////////////////




////////////////////    2   //////////////////////
//        base= (LinearLayout) findViewById(R.id.base);
//        tf=new EditText(this);
//        btn=new Button(this);
//        btn.setText(R.string.app_name);
//        lb=new TextView(this);
//
//        base.addView(tf);
//        base.addView(btn);
//        base.addView(lb);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                System.out.print(tf.getText().toString());
//                Log.d("test",tf.getText().toString());
//                lb.setText(tf.getText().toString());
//            }
//        });


////////////////////    1   //////////////////////
//        tf= (EditText) findViewById(R.id.tf);
//        btn= (Button) findViewById(R.id.btn);
//        tv= (TextView) findViewById(R.id.lb);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                msg=tf.getText().toString();
//                tv.setText(msg);
//
//            }
//        });
    }
}












