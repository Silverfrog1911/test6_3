package com.springboot.test6.Dao;

import com.springboot.test6.pojo.TestTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface testMapper {

    @Select("Select * FROM TestTable")
    public List<TestTable> SelectAll();


}
