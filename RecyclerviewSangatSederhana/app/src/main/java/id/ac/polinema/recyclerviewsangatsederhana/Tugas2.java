package id.ac.polinema.recyclerviewsangatsederhana;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.Tugas2Adapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.ItemContent;

public class Tugas2  extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ItemContent> itemContentsArray;
    Tugas2Adapter adapter;

    private int[] ListImage = new int[]{
            R.drawable.i11,
            R.drawable.m30,
            R.drawable.mixalpa,
            R.drawable.s11,
            R.drawable.rog,
            R.drawable.p4
    };

    private String[] ListTitle = new String[]{
            "Iphone 11",
            "Huawai Matc 30",
            "Xiaomi MixAlpha",
            "Samsung S11",
            "Samsung ROG phone",
            "Pixel 4"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tugas2);
        recyclerView = findViewById(R.id.view_tugas2);
        itemContentsArray = List();
        adapter = new Tugas2Adapter(itemContentsArray, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
    }

    private ArrayList<ItemContent> List() {
        ArrayList<ItemContent> list = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            ItemContent itemContent = new ItemContent();
            itemContent.setTitle(ListTitle[i]);
            itemContent.setImage(ListImage[i]);
            list.add(itemContent);
        }
        return list;
    }
}
