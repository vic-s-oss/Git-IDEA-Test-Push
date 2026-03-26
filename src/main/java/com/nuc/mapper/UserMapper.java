package com.nuc.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nuc.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {
}
