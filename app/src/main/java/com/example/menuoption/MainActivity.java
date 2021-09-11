package com.example.menuoption;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para mostrar y ocultar el Menú
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuoverflow,menu);
        return true;
    }

    //Funciones para cada Item del Menú
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        String nombre = item.getTitle().toString();

        Log.d("CREATION", nombre);

        if (id == R.id.item1) {
            Toast.makeText(this,item.getTitle().toString(),Toast.LENGTH_SHORT).show();
        }else if (id == R.id.item2){
            Toast.makeText(this,item.getTitle().toString(),Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item3){
            Toast.makeText(this,item.getTitle().toString(),Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}