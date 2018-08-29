package com.example.youdongkwan.frag2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Frag1 frag1;
    Frag2 frag2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = new Frag1();
        frag2 = new Frag2();

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,frag1).commit();
            }
        });
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,frag2).commit();
            }
        });
    }

    public void onFragmentChange(int select){
        if(select == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,frag1).commit();
        }
        else if(select == 2){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,frag2).commit();
        }
    }
}
