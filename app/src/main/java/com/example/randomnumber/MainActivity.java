package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button2);
        textView=findViewById(R.id.textView);
        Set<Integer> data = new LinkedHashSet<>();
        int max=99;
        int min=1;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num=(int)Math.floor(Math.random() * (max - min + 1) + min);;
                boolean contains;

                contains = data.contains(num);
                if(!contains)
                {
                    data.add(num);
                    String str = String.valueOf(num);
                    textView.setText(str);
                }
                else {
                    textView.setText("oops");
                }
                            }
        });
    }
}