package com.tien.repository;

import com.tien.model.Category;
import com.tien.config.ConnectionDB;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    @Override
    public void save(Category category) {
        Connection conn = ConnectionDB.openConnection();
        CallableStatement stmt = null;
        try {
            stmt = conn.prepareCall("{CALL insert_category(?, ?)}");
            stmt.setString(1, category.getCategoryName());
            stmt.setBoolean(2, category.isStatus());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, stmt);
        }
    }

    @Override
    public List<Category> findAll() {
        List<Category> list = new ArrayList<>();
        Connection conn = ConnectionDB.openConnection();
        CallableStatement stmt = null;
        try {
            stmt = conn.prepareCall("{CALL get_all_categories()}");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Category cat = new Category();
                cat.setId(rs.getInt("id"));
                cat.setCategoryName(rs.getString("categoryName"));
                cat.setStatus(rs.getBoolean("status"));
                list.add(cat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, stmt);
        }
        return list;
    }

    @Override
    public void update(Category category) {
        Connection conn = ConnectionDB.openConnection();
        CallableStatement stmt = null;
        try {
            stmt = conn.prepareCall("{CALL update_category(?, ?, ?)}");
            stmt.setInt(1, category.getId());
            stmt.setString(2, category.getCategoryName());
            stmt.setBoolean(3, category.isStatus());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, stmt);
        }
    }

    @Override
    public void delete(int id) {
        Connection conn = ConnectionDB.openConnection();
        CallableStatement stmt = null;
        try {
            stmt = conn.prepareCall("{CALL delete_category(?)}");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, stmt);
        }
    }

    @Override
    public Category findByName(String name) {
        Connection conn = ConnectionDB.openConnection();
        CallableStatement stmt = null;
        try {
            stmt = conn.prepareCall("{CALL find_category_by_name(?)}");
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Category cat = new Category();
                cat.setId(rs.getInt("id"));
                cat.setCategoryName(rs.getString("categoryName"));
                cat.setStatus(rs.getBoolean("status"));
                return cat;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, stmt);
        }
        return null;
    }

    @Override
    public Category findById(int id) {
        Connection conn = ConnectionDB.openConnection();
        CallableStatement stmt = null;
        try {
            stmt = conn.prepareCall("{CALL find_category_by_id(?)}");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Category cat = new Category();
                cat.setId(rs.getInt("id"));
                cat.setCategoryName(rs.getString("categoryName"));
                cat.setStatus(rs.getBoolean("status"));
                return cat;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, stmt);
        }
        return null;
    }

    @Override
    public boolean existsByCategoryName(String name) {
        Connection conn = ConnectionDB.openConnection();
        CallableStatement stmt = null;
        try {
            stmt = conn.prepareCall("{CALL check_category_name(?)}");
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, stmt);
        }
        return false;
    }

    @Override
    public boolean existsByCategoryNameExcludingId(String name, int id) {
        Connection conn = ConnectionDB.openConnection();
        CallableStatement stmt = null;
        try {
            stmt = conn.prepareCall("{CALL check_category_name_exclude_id(?, ?)}");
            stmt.setString(1, name);
            stmt.setInt(2, id);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, stmt);
        }
        return false;
    }

}
