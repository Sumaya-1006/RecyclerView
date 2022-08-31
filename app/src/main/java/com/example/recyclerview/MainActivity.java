package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Book> listBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listBook = new ArrayList<>();
        listBook.add(new Book("Daughters of Nights","Category Book","Description Book",R.drawable.daughters));
        listBook.add(new Book("THE ESCAPE ARTIST","Category Book","Description Book",R.drawable.escape));
        listBook.add(new Book("Fallen Idols","Category Book","Description Book",R.drawable.fallen));
        listBook.add(new Book("THE BOOK THIEF","Category Book","Description Book",R.drawable.thief));
        listBook.add(new Book("SECRET CITY","Category Book","Description Book",R.drawable.city));
        listBook.add(new Book("FORTUNES CHILD","Category Book","Description Book",R.drawable.fortune));
        listBook.add(new Book("THE ROSE CODE","Category Book","Description Book",R.drawable.kate));
        listBook.add(new Book("GHOSTS OF SPAIN","Category Book","Description Book",R.drawable.ghost));
        listBook.add(new Book("THE BOOK OF LOST FRIENDS","Category Book","Description Book",R.drawable.lisa));
        listBook.add(new Book("ALL LIGHT WE CANNOT SEE","Category Book","Description Book",R.drawable.night));
        listBook.add(new Book("ELIZABETH STUART","Category Book","Description Book",R.drawable.elizabeth));
        listBook.add(new Book("ALEXANDER HAMILTON","Category Book","Description Book",R.drawable.hamilton));
        listBook.add(new Book("Daughters of Nights","Category Book","Description Book",R.drawable.daughters));
        listBook.add(new Book("THE ROSE CODE","Category Book","Description Book",R.drawable.kate));
        listBook.add(new Book("FORTUNES CHILD","Category Book","Description Book",R.drawable.fortune));
        listBook.add(new Book("THE BOOK OF LOST FRIENDS","Category Book","Description Book",R.drawable.lisa));
        listBook.add(new Book("ALL LIGHT WE CANNOT SEE","Category Book","Description Book",R.drawable.night));
        listBook.add(new Book("ELIZABETH STUART","Category Book","Description Book",R.drawable.elizabeth));

        RecyclerView recyclerView = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter MyViewAdapter = new RecyclerViewAdapter(this,listBook);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(MyViewAdapter);

    }
}