package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handle_praktikum(View view) {
        startActivity(new Intent(this, Praktikum.class));
    }

    public void handle_tugas1(View view) {
        startActivity(new Intent(this, Tugas1.class));
    }

}
