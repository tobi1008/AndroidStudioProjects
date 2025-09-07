package com.example.bimonapp;

/**
 * Đây là lớp Model (mô hình dữ liệu) cho mỗi loại trái cây.
 * Nó chứa thông tin về tên và ID hình ảnh của trái cây.
 * Các biến được đặt là 'private' để đảm bảo tính đóng gói,
 * và chúng ta cung cấp các phương thức 'public' (getters) để truy cập chúng.
 */
public class fruit {
    private String name;
    private int imageId;

    // Hàm khởi tạo (Constructor) để tạo một đối tượng fruit mới
    public fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    // Phương thức public (getter) để lấy tên của trái cây
    public String getName() {
        return name;
    }

    // Phương thức public (getter) để lấy ID hình ảnh của trái cây
    public int getImageId() {
        return imageId;
    }
}

