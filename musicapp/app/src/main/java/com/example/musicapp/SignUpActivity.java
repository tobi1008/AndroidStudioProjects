package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;      // Quan trọng: Cần cho OnClickListener
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
// MainActivity được import ngầm vì nó cùng package, nhưng thêm vào cũng không sao
// import com.example.musicapp.MainActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up); // Đảm bảo bạn có file res/layout/sign_up.xml

        // Tìm TextView "Đã có tài khoản? Đăng nhập ngay" bằng ID của nó
        // (ID này được định nghĩa trong file sign_up.xml)
        TextView tvGoToSignIn = findViewById(R.id.tvGoToSignIn);

        // Xử lý sự kiện click để quay lại MainActivity (màn hình đăng nhập)
        tvGoToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo một Intent để chuyển từ SignUpActivity sang MainActivity
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Đóng SignUpActivity để người dùng không quay lại được bằng nút back
            }
        });

        // Nếu bạn có nút "Đăng ký" (ví dụ: Button với id btnPerformSignUp trong sign_up.xml)
        // và muốn thêm xử lý (dù chỉ là placeholder cho giao diện), bạn có thể làm như sau:
        /*
        Button btnPerformSignUp = findViewById(R.id.btnPerformSignUp); // Thay R.id.btnPerformSignUp bằng ID thực tế
        if (btnPerformSignUp != null) {
            btnPerformSignUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Hiện tại không làm gì cả vì chỉ tập trung vào giao diện
                    // Toast.makeText(SignUpActivity.this, "Nút Đăng ký được nhấn!", Toast.LENGTH_SHORT).show();
                }
            });
        }
        */
    }
}

