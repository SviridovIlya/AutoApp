package com.example.dolbanyujas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dolbanyujas2.adapter.CategoryAdapter;
import com.example.dolbanyujas2.model.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "запчасти"));
        categoryList.add(new Category(2, "автомобили"));
        categoryList.add(new Category(3, "новости"));
        categoryList.add(new Category(4, "сувениры"));

        setCategoryRecicler(categoryList);
        
    }

    private void setCategoryRecicler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);

        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);

        categoryRecycler.setAdapter(categoryAdapter);

    }

}
