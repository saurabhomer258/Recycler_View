package com.example.saurabhomer.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Book> lstBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstBook =new ArrayList<>();
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image5));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.images6));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image7));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.img1));
        lstBook.add(new Book("The wild Rebot","Category Book","Description Book",R.drawable.image2));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image3));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image4));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image5));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.images6));

        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.img1));
        lstBook.add(new Book("The wild Rebot","Category Book","Description Book",R.drawable.image2));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image3));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image4));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image5));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.images6));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image7));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image5));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.images6));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image7));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.img1));
        lstBook.add(new Book("The wild Rebot","Category Book","Description Book",R.drawable.image2));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image3));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image4));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image5));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.images6));

        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.img1));
        lstBook.add(new Book("The wild Rebot","Category Book","Description Book",R.drawable.image2));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image3));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image4));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image5));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.images6));
        lstBook.add(new Book("The Vegitarian","Category Book","Description Book",R.drawable.image7));
        RecyclerView myrv=(RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter= new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}
