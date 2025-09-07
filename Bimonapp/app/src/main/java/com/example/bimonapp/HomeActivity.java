package com.example.bimonapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private Button buttonProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Ánh xạ view từ file layout
        buttonProfile = findViewById(R.id.buttonProfile);

        // Xử lý sự kiện click cho nút Profile
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo một Intent để chuyển từ HomeActivity sang ProfileActivity
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        // ------------------ CODE BẠN CẦN THÊM VÀO ------------------
//        String[] items = {"Apple", "Banana", "Cherry", "Grapes", "Mango", "Orange"};
        ArrayList<fruit> fruits = new ArrayList<>();
        fruits.add(new fruit("Apple", R.drawable.apple));
        fruits.add(new fruit("Banana", R.drawable.banana));
        fruits.add(new fruit("Cherry", R.drawable.apple));
        fruits.add(new fruit("Grapes", R.drawable.apple));
        fruits.add(new fruit("Mango", R.drawable.apple));
        fruits.add(new fruit("Orange", R.drawable.apple));

//        int[] images = {R.drawable.apple, R.drawable.banana, R.drawable.apple, R.drawable.banana, R.drawable.apple, R.drawable.banana};
        // Tìm ListView theo ID trong layout
        ListView listView = findViewById(R.id.listView1);

        // Tạo ArrayAdapter để liên kết dữ liệu với ListView
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                items
//        );

        // Gán adapter cho ListView để hiển thị danh sách
        ListAdapter adapter = new ListAdapter(this, fruits);
        listView.setAdapter(adapter);
        // -------------------------------------------------------------
    }
}
