package com.example.musicapp;

// Thêm các import cần thiết ở đây
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); // Đảm bảo activity_main.xml có TextView với id là tvSignUp

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // --- BẮT ĐẦU CODE MỚI ĐỂ THÊM VÀO ---
        // Tìm TextView "Đăng ký tài khoản mới" bằng ID của nó
        // ID "tvSignUp" này phải được định nghĩa trong file activity_main.xml của bạn
        TextView tvGoToSignUp = findViewById(R.id.tvSignUp);

        // Kiểm tra xem tvGoToSignUp có null không trước khi đặt listener
        // (để tránh NullPointerException nếu ID bị sai hoặc View không tồn tại)
        if (tvGoToSignUp != null) {
            tvGoToSignUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Tạo một Intent để chuyển từ MainActivity sang SignUpActivity
                    Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                    startActivity(intent);
                }
            });
        }
        // --- KẾT THÚC CODE MỚI ---
    }
}
