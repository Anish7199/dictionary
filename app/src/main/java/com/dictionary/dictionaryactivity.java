package com.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class dictionaryactivity extends AppCompatActivity {
private ListView  dict;
private Map<String, String> dictionary;

public static final String words[] = {
        "Yeta aunus","Come Here",
        "Uta janus", "Go there",
        "Namaste","Hello",
        "Kata chau?","Where are you?",
        "Kata jane?","Where are you going"
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionaryactivity);

        dict = findViewById(R.id.dict);
        dictionary = new HashMap<>();

        for (int i = 0; i <words.length; i +=2){
            dictionary.put(words[i] ,words[i+1]);
        }
        ArrayAdapter adapter = new ArrayAdapter<>(
            this,
                android.R.layout.simple_list_item_1,
                new ArrayList<String>(dictionary.keySet())
        );
        dict.setAdapter(adapter);
        dict.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String key = parent.getItemAtPosition(position).toString();
                String meaning = dictionary.get(key);

                Intent intent = new Intent(dictionaryactivity.this,meaningactivity.class);
                intent.putExtra("anish",meaning);
                startActivity(intent);
            }
        });



        }
    }

