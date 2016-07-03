package com.example.gabri.intentapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PrimeiraActivity extends Activity {
EditText caixaDeTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);


    }

    protected void confirmar(View a){
        caixaDeTexto= (EditText) findViewById(R.id.digiteAqui);
        Log.i("IntentApplication",caixaDeTexto.getText().toString());
        Toast mensagem= Toast.makeText(this,caixaDeTexto.getText().toString(),Toast.LENGTH_SHORT);
                mensagem.show();
    }

    protected void mudanca(View a){
        Bundle bundle=new Bundle;
        bundle.putString("key",caixaDeTexto.getText().toString());
        Intent intent= new Intent(this,SegundaActivity.class);
        intent.putExtra(bundle);
        startActivity(intent);

    }
}
