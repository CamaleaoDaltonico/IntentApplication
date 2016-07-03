package com.example.gabri.intentapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle bundle=getIntent().getExtras();
        if (bundle != null){
            String mensagem = bundle.getString("key");
                if (mensagem != null){
                    TextView textView= (TextView) findViewById(R.id.texto);
                    textView.setText(mensagem);
                }

        }
    }
}
