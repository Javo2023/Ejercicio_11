package com.example.ejercicio_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.ejercicio_11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding; //atributo


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.buttonPlane.setOnClickListener(v -> Toast.makeText(this,"Modo avión desactivado", Toast.LENGTH_SHORT).show());
        binding.buttonUpdate.setOnClickListener(v -> Toast.makeText(this,"Actualizado", Toast.LENGTH_SHORT).show());
        binding.buttonPicture.setOnClickListener(v -> Toast.makeText(this,"Imagen guardada", Toast.LENGTH_SHORT).show());
        binding.buttonUnlocked.setOnClickListener(v -> Toast.makeText(this,"desbloqueado", Toast.LENGTH_SHORT).show());
        binding.buttonLevel.setOnClickListener(v -> Toast.makeText(this,"Nivel 4 superado", Toast.LENGTH_SHORT).show());
        binding.buttonMusic.setOnClickListener(v -> Toast.makeText(this,"Musica activada", Toast.LENGTH_SHORT).show());



    }
}