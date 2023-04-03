package com.atguigu.mybatisx.mapper;
import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatisx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author win11
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-04-01 15:38:03
* @Entity com.atguigu.mybatisX.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {

    int insertSelective(User user);

    int deleteByIdAndName(@Param("id") Long id, @Param("name") String name);

    int updateAgeById(@Param("age") Integer age, @Param("id") Long id);

    List<User> selectAgeAndSexByAgeBetween(@Param("beginAge") Integer beginAge, @Param("endAge") Integer endAge);

}




