package com.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class meaningactivity extends AppCompatActivity {
private TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meaningactivity);

        Bundle bundle  = getIntent().getExtras();

        if(bundle != null){
            String meaning = bundle.getString("anish");

            txtView= findViewById(R.id.txtView);
            txtView.setText(meaning);

        }
        else {
            Toast.makeText(this,"Not Found", Toast.LENGTH_SHORT).show();
        }
    }

}
