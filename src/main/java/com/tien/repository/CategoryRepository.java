package com.tien.repository;

import com.tien.model.Category;
import java.util.List;

public interface CategoryRepository {
    void save(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> findAll();
    Category findByName(String name);
    Category findById(int id);

    // kiểm tra tồn tại theo tên
    boolean existsByCategoryName(String name);

    // kiểm tra tồn tại tên, nhưng loại trừ một ID (khi sửa)
    boolean existsByCategoryNameExcludingId(String name, int id);
}
