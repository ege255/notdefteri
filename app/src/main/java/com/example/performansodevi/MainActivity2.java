package com.example.performansodevi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.performansodevi.databinding.ActivityMain2Binding;
import com.example.performansodevi.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private String bilgial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        EdgeToEdge.enable(this);
        setContentView(view);

        preferences=MainActivity2.this.getSharedPreferences("com.example.performansodevi", Context.MODE_PRIVATE);


        binding.btntamam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor = preferences.edit();
                editor.putString("not", binding.tv22.toString().trim());
                editor.apply();

                bilgial = preferences.getString("not", null);

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("icerik", bilgial.toString());
                startActivity(intent);
            }
        });

        };




}
