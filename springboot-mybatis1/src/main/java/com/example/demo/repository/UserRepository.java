package com.example.demo.repository;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    @Select("select * from user where id = #{id}")
    User getUserById(int id);

    @Update("update user set userName=#{userName} where id = #{id}")
    void updateNameById(int id, String userName);
}
