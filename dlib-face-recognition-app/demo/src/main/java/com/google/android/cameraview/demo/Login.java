package com.google.android.cameraview.demo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
public class Login extends AppCompatActivity {
    EditText text_capcha;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Random rnd=new Random();
        index=(int)(rnd.nextDouble()*2+1);

        ImageView capcha = (ImageView)findViewById(R.id.capcha);
        Drawable new_image;
        if (index==1){
            new_image= getResources().getDrawable(R.drawable.t1);
        }
        else{
            new_image= getResources().getDrawable(R.drawable.t2);
        }
        capcha.setBackgroundDrawable(new_image);


        text_capcha = (EditText)findViewById(R.id.txt_capcha);

        TextView button1 = (TextView) findViewById(R.id.btn_capcha);

        button1.setOnClickListener(new View.OnClickListener(){
                                       public void onClick(View view) {
                                           String str_capcha=text_capcha.getText().toString();
                                           if (index==1){
                                               if(str_capcha.equals("Rt2Qd")){
                                                   Toast.makeText(getApplication(),"Username and password match", Toast.LENGTH_SHORT).show();
                                               }else{
                                                   Toast.makeText(getApplication(),"Username and password no match", Toast.LENGTH_SHORT).show();
                                               }
                                           }
                                           else{
                                               if(str_capcha.equals("W87NA")){
                                                   Toast.makeText(getApplication(),"Username and password match", Toast.LENGTH_SHORT).show();
                                               }else{
                                                   Toast.makeText(getApplication(),"Username and password no match", Toast.LENGTH_SHORT).show();
                                               }
                                           }

                                       }
                                   }
        );
    }
}
