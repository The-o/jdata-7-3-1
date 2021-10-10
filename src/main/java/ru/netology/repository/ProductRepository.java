package ru.netology.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.RowSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import ru.netology.util.ResourceHelper;

@Repository
public class ProductRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final String selectProductNames;

    public ProductRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.selectProductNames = ResourceHelper.readResource("select.sql");
    }

    public List<String> getProductNames(String customerName) {
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(selectProductNames, Map.of("name", customerName));
        List<String> result = new ArrayList<>();

        while(rowSet.next()) {
            result.add(rowSet.getString("product_name"));
        }

        return result;
    }


}

